package top.hyzhu.springboot.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.springboot.database.entity.Course;
import top.hyzhu.springboot.database.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-08 18:49
 **/
@SpringBootTest
@Slf4j
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;


    @Test
    void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("测试学生")
                .hometown("江苏南京")
                .birthday(LocalDate.now())
                .build();
        int n = studentMapper.insert(student);
        assertEquals(1,n);
    }

    @Test
    void findById() {
        Student student = studentMapper.findById(1001);
        assertEquals("新的名字",student.getStudentName());
    }

    @Test
    void updateById() {
        Student student = Student.builder()
                .studentId(1001)
                .studentName("钱智康")
                .build();
        int n = studentMapper.updateById(student);
        assertEquals(1,n);
    }

    @Test
    void deleteById() {
        int n = studentMapper.deleteById(8013);
        assertEquals(1,n);
    }

    @Test
    void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(8000 + i)
                    .clazzId(1)
                    .studentName("测试学生" + i)
                    .hometown("江苏南京")
                    .birthday(LocalDate.now())
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchInsert(students);
        assertEquals(10,n);
    }

    @Test
    void batchDelete() {
        List<Integer> idList = List.of(8000,8001,8002,8003,8004,8005,8006,8007,8008,8009);
        int n = studentMapper.batchDelete(idList);
        assertEquals(10,n);
    }

    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder().studentId(8000 + i).studentName("新名字11" + i).build();
            students.add(student);
        }
        int n = studentMapper.batchUpdate(students);
        assertEquals(1, n);
    }

    @Test
    void selectByDynamicSql() {
        Student student = Student.builder().hometown("州").build();
        List<Student> students = studentMapper.selectByDynamicSql(student);
        students.forEach(System.out::println);
    }

    @Test
    void getStudent(){
        Student student = studentMapper.getStudent(1001);
        log.info("{},{}",student.getStudentName(),student.getHometown());
        List<Course> courses = student.getCourses();
        courses.forEach(course -> log.info("{},{}",course.getCourseId(),course.getCourseName()));
    }
}