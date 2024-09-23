package top.hyzhu.springboot.configure.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 14:53
 **/
@SpringBootTest
class PersonTest {
    @Resource
    private Person person;

    @Test
    void testPerson(){
        System.out.println(person);
    }
}