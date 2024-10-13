package top.hyzhu.qasystem.mapper;

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
 * @Date: 2024-10-12 22:24
 **/
@SpringBootTest
@Slf4j
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void insertUser() {
       User user= User.builder()
               .username("zhy")
               .password("123456")
               .email("123456@qq.com")
               .createTime(LocalDateTime.now())
               .build();
       int n = userMapper.insertUser(user);
       assertEquals(1,n);
    }

    @Test
    void findByUsernameAndPassword() {
        String username = "zhangsan";
        String password = "123456";

        // 测试查询用户
        User user = userMapper.findByUsernameAndPassword(username, password);

        // 验证用户是否存在
        assertNotNull(user);
        log.info("用户登录成功: {}", user);

    }

}