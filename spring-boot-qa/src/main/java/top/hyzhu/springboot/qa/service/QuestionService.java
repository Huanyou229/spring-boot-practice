package top.hyzhu.springboot.qa.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.qa.entity.Question;
import top.hyzhu.springboot.qa.mapper.QuestionMapper;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-23 20:00
 **/


@Service
public class QuestionService extends ServiceImpl<QuestionMapper, Question> {

    @Resource
    private QuestionMapper questionMapper;

    // 根据问题ID获取问题详情及提问者信息
    public Question getQuestionWithUser(Long id) {
        return questionMapper.getQuestionWithUser(id);
    }

    // 获取所有问题及其提问者信息
    public List<Question> getAllQuestionsWithUsers() {
        return questionMapper.getAllQuestionsWithUsers();
    }

}
