package top.hyzhu.springboot.redis;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import top.hyzhu.springboot.redis.entity.Address;
import top.hyzhu.springboot.redis.entity.Student;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 13:56
 **/
@SpringBootTest
public class RedisTemplateTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, Student> redisTemplate;

    @Test
    void test1(){
        stringRedisTemplate.opsForValue().set("hello","world",60, TimeUnit.SECONDS);
    }

    @Test
    void test2(){
        Address address = Address.builder().province("江苏").city("南京").build();
        Student student = Student.builder().id("123").name("张三").address(address).build();
        redisTemplate.opsForValue().set("student",student,60, TimeUnit.SECONDS);
    }


}
