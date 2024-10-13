package top.hyzhu.qasystem.Service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.qasystem.entity.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-13 13:10
 **/

@SpringBootTest
@Slf4j
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    void register() {
        // 构建测试用户对象，仅包含用户名和密码
        User user = User.builder()
                .username("testUser")
                .password("testPassword")
                .createTime(LocalDateTime.now())  // 设置当前时间
                .build();

        // 调用注册方法
        userService.register(user);

        // 验证用户注册是否成功（通过日志或者调试来检查是否插入成功）
        log.info("用户注册成功: {}", user);
    }


    @Test
    void login() {
        String username = "zhangsan";
        String password = "123456";

        // 调用 UserService 的 login 方法
        User user = userService.login(username, password);

        // 验证用户是否登录成功
        assertNotNull(user);
        log.info("用户登录成功: {}", user);
    }
}