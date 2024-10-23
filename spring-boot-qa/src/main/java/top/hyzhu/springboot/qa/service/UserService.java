package top.hyzhu.springboot.qa.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.qa.entity.Answer;
import top.hyzhu.springboot.qa.entity.Question;
import top.hyzhu.springboot.qa.entity.User;
import top.hyzhu.springboot.qa.mapper.AnswerMapper;
import top.hyzhu.springboot.qa.mapper.QuestionMapper;
import top.hyzhu.springboot.qa.mapper.UserMapper;
import top.hyzhu.springboot.qa.utils.JwtUtil;


import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhy
 * @Description: UserService
 * @Date: 2024-10-14 14:28
 **/
@Service
@AllArgsConstructor
public class UserService extends ServiceImpl<UserMapper, User> {


    private final UserMapper userMapper;
    private final AnswerMapper answerMapper;
    private final QuestionMapper questionMapper;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public String login(String username, String password) {
        // 根据用户名和密码查询用户
        User user = userMapper.selectByUsernameAndPassword(username, password);
        if (user != null) {
            // 生成JWT token
            String token = JwtUtil.generateToken(username);

            // 将 token 存储到 Redis，设置过期时间
            redisTemplate.opsForValue().set("token:" + username, token, 1, TimeUnit.HOURS);

            return token;
        } else {
            throw new RuntimeException("用户名或密码错误");
        }
    }

    // 验证 token
    public boolean validateToken(String token) {
        // 从 Redis 中查找 token
        String username = JwtUtil.getUsernameFromToken(token);
        String redisToken = (String) redisTemplate.opsForValue().get("token:" + username);

        // 验证 token 是否有效
        return redisToken != null && redisToken.equals(token) && JwtUtil.validateToken(token);
    }


    // 创建⽤户，⾃动填充创建时间和更新时间
    public boolean createUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        // 可以设置默认值，或者保持为 null
        user.setAvatar(null);
        user.setPhone(null);
        user.setEmail(null);
        return this.save(user);
    }

    // 更新⽤户，⾃动填充更新时间
    public boolean updateUser(User user) {
        return this.updateById(user);
    }

    // 根据ID查询⽤户
    public User getUserById(Long id) {
        // 查询单个⽤户
        return this.getById(id);
    }

    // 创建问题
    public boolean createQuestion(String title, String content, Long userId) {
        Question question = new Question();
        question.setTitle(title);
        question.setContent(content);
        question.setUserId(userId);
        return questionMapper.insert(question) > 0;
    }

    // 创建回答
    public boolean createAnswer(Long questionId, String content, Long userId) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setContent(content);
        answer.setUserId(userId);
        return answerMapper.insert(answer) > 0;
    }





}