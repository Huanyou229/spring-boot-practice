package top.hyzhu.springboot.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.springboot.database.entity.Course;
import top.hyzhu.springboot.database.entity.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-12 15:37
 **/
@SpringBootTest
@Slf4j
class CourseMapperTest {
@Resource
 private CourseMapper courseMapper;
@Test
    void selectAll() {
        List<Course> courses = courseMapper.selectAll(20001);
        courses.forEach(course -> {
            log.info("课程名称：{}", course.getCourseName());
            List<Student> students = course.getStudents();
            log.info("所有的学生信息：");
            students.forEach(student -> log.info("{},{},{},{}", student.getStudentId(), student.getStudentName(),student.getHometown(),student.getBirthday()));
        });
    }
}