package top.hyzhu.springboot.mp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.hyzhu.springboot.mp.entity.Student;
import top.hyzhu.springboot.mp.service.StudentService;

/**
 * @Author: zhy
 * @Description: StudentController
 * @Date: 2024-10-14 15:55
 **/
@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    /**
     * 获取学⽣及其课程信息
     */
    @GetMapping("/{id}/courses")
    public Student getStudentWithCourses(@PathVariable Long id) {
        return studentService.getStudentWithCourses(id);
    }

}
