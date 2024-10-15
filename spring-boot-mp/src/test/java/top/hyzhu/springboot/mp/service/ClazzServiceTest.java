package top.hyzhu.springboot.mp.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.springboot.mp.entity.Clazz;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-14 15:47
 **/
@SpringBootTest
@Slf4j
class ClazzServiceTest {
    @Resource
    private ClazzService clazzService;
    @Test
    void getClazzWithTeacher() {
        Clazz clazzWithTeacher = clazzService.getClazzWithTeacher(1L);
        log.info(clazzWithTeacher.toString());
    }

    @Test
    void getClazzWithStudent() {
        Clazz clazzWithStudent = clazzService.getClazzWithStudent(1L);

        // 输出班级信息以及学生列表
        System.out.println("班级名称: " + clazzWithStudent.getName());
        System.out.println("学生列表: " + clazzWithStudent.getStudents());
    }

}