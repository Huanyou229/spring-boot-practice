package top.hyzhu.qasystem.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.qasystem.Service.UserService;
import top.hyzhu.qasystem.dto.LoginRequest;
import top.hyzhu.qasystem.entity.User;
import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description: UserController
 * @Date: 2024-10-12 21:43
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/register")
//    ResponseEntity<String>: 该方法返回一个ResponseEntity对象，其中包含一个String类型的响应体。
//    如果email参数在HTTP请求中不存在，Spring会将其设置为null
    public ResponseEntity<String> register(@RequestParam String username, @RequestParam String password, @RequestParam(required = false) String email) {
        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .createTime(LocalDateTime.now())
                .build();
        userService.register(user);
        return ResponseEntity.ok("用户注册成功！");
    }


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
        // 调用 UserService 的 login 方法
        User loggedInUser = userService.login(loginRequest.getUsername(), loginRequest.getPassword());

        // 检查用户是否登录成功
        if (loggedInUser != null) {
            // 将用户 ID 保存到会话中
            session.setAttribute("userId", loggedInUser.getId());
            return ResponseEntity.ok("登录成功！");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("用户名或密码无效。");
        }
    }

}

