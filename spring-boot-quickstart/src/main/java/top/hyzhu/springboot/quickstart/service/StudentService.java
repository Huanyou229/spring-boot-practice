package top.hyzhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.entity.Student;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 23:57
 **/
@Service
public class StudentService {
    // 使用 JDK 9 的 List.of() 初始化不可变学生列表
    private List<Student> students = List.of(
            new Student(1L, "Alice", 20, "Computer Science"),
            new Student(2L, "Bob", 22, "Mechanical Engineering"),
            new Student(3L, "Charlie", 21, "Electrical Engineering")
    );

    // 使用 JDK 9 的 Set.of() 初始化不可变专业集合
    private Set<String> majors = Set.of("Computer Science", "Mechanical Engineering", "Electrical Engineering");

    // 使用 JDK 9 的 Map.of() 初始化不可变课程-学分映射
    private Map<String, Integer> courses = Map.of(
            "Math", 3,
            "Physics", 4,
            "Programming", 5
    );

    // 获取学生列表
    public List<Student> getAllStudents() {
        return students;
    }

    // 获取所有专业
    public Set<String> getAllMajors() {
        return majors;
    }

    // 获取课程-学分映射
    public Map<String, Integer> getAllCourses() {
        return courses;
    }
}
