package top.hyzhu.springboot.quickstart.controller;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.quickstart.entity.Student;
import top.hyzhu.springboot.quickstart.service.StudentService;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 23:58
 **/


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/majors")
    public Set<String> getAllMajors() {
        return studentService.getAllMajors();
    }

    @GetMapping("/courses")
    public Map<String, Integer> getAllCourses() {
        return studentService.getAllCourses();
    }
}

