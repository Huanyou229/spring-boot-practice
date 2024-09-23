package top.hyzhu.springboot.configure.entity;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 16:48
 **/

@SpringBootTest
@Slf4j
class StudentTest {

    @Resource
    private Dog dog;

    @Resource
    private Student student;

    @Test
    void testStudent() {
        log.info(String.valueOf(dog));  // 输出 dog 的信息
        log.info(String.valueOf(student));  // 输出 student 的信息
    }
}
