package top.hyzhu.springboot.qa.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.qa.entity.User;
import top.hyzhu.springboot.qa.service.UserService;
import top.hyzhu.springboot.qa.utils.JwtUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhy
 * @Description: UserController
 * @Date: 2024-10-14 14:30
 **/
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    // 创建用户，只需要用户名和密码
    @PostMapping("/create")
    public String createUser(@RequestParam String username, @RequestParam String password) {
        boolean result = userService.createUser(username, password);
        return result ? "注册成功！" : "注册失败！";
    }

    // 登录接口
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestParam String username, @RequestParam String password) {
        Map<String, Object> result = new HashMap<>();
        try {
            String token = userService.login(username, password);

            // 登录成功，返回 token
            result.put("token", token);
            result.put("message", "登录成功");
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // 登录失败，返回错误信息
            result.put("message", "登录失败，用户名或密码错误");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
        }
    }

    // 需要 token 保护的接口，示例：获取用户信息
    @GetMapping("/info")
    public ResponseEntity<?> getUserInfo(@RequestHeader("Authorization") String token) {
        try {
            // 验证 token 是否有效
            if (userService.validateToken(token)) {
                // 从 token 中获取用户名
                String username = JwtUtil.getUsernameFromToken(token);

                // 查询用户信息
                User user = userService.getOne(new QueryWrapper<User>().eq("username", username));

                if (user != null) {
                    return ResponseEntity.ok(user);
                } else {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("用户信息不存在");
                }
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token 无效或已过期");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("服务器内部错误");
        }
    }

    // 更新⽤户
    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        boolean result = userService.updateUser(user);
        return result ? "⽤户更新成功" : "⽤户更新失败";
    }
    
    // 根据ID查询⽤户
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // 提出问题接口
    @PostMapping("/questions")
    public ResponseEntity<Map<String, Object>> createQuestion(@RequestBody Map<String, String> params,
                                                              @RequestHeader("Authorization") String token) {
        // 从 token 获取用户 ID
        Long userId = getUserIdFromToken(token);
        String title = params.get("title");
        String content = params.get("content");

        boolean result = userService.createQuestion(title, content, userId);
        Map<String, Object> response = new HashMap<>();
        response.put("message", result ? "问题创建成功" : "问题创建失败");
        return ResponseEntity.ok(response);
    }

    // 回答问题接口
    @PostMapping("/answers")
    public ResponseEntity<Map<String, Object>> createAnswer(@RequestBody Map<String, String> params,
                                                            @RequestHeader("Authorization") String token) {
        Long userId = getUserIdFromToken(token); // 从 token 获取用户 ID
        Long questionId = Long.valueOf(params.get("questionId"));
        String content = params.get("content");

        boolean result = userService.createAnswer(questionId, content, userId);
        Map<String, Object> response = new HashMap<>();
        response.put("message", result ? "回答提交成功" : "回答提交失败");
        return ResponseEntity.ok(response);
    }

    // 从 token 中获取用户 ID
    private Long getUserIdFromToken(String token) {
        String username = JwtUtil.getUsernameFromToken(token);
        User user = userService.getOne(new QueryWrapper<User>().eq("username", username));
        return user != null ? user.getId() : null;
    }

}