package top.hyzhu.springboot.qa;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-23 15:19
 **/
@SpringBootTest
public class RedisTemplateTest {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Test
    void StringRedisTemplateTest() {
        stringRedisTemplate.opsForValue().set("hello", "world", 60, TimeUnit.SECONDS);
    } }