package top.hyzhu.springboot.mp.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.mp.entity.Course;
import top.hyzhu.springboot.mp.entity.Student;
import top.hyzhu.springboot.mp.mapper.StudentCourseMapper;
import top.hyzhu.springboot.mp.mapper.StudentMapper;

import java.util.List;

/**
 * @Author: zhy
 * @Description: StudentService
 * @Date: 2024-10-14 15:51
 **/
@Service
@AllArgsConstructor
public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentCourseMapper studentCourseMapper;
    /**
     * 根据学⽣ID获取该学⽣的课程信息
     */
    public Student getStudentWithCourses(Long studentId) {
        Student student = studentMapper.selectById(studentId);
        if (student != null) {
            List<Course> courses = studentCourseMapper.selectCoursesByStudentId(studentId);
            student.setCourses(courses);
        }
        return student;
    } }