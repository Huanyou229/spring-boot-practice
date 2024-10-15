package top.hyzhu.springboot.mp.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.mp.entity.Clazz;
import top.hyzhu.springboot.mp.entity.Student;
import top.hyzhu.springboot.mp.entity.Teacher;
import top.hyzhu.springboot.mp.mapper.ClazzMapper;

import java.util.List;

/**
 * @Author: zhy
 * @Description: ClazzService
 * @Date: 2024-10-14 15:44
 **/
@Service
@AllArgsConstructor
public class ClazzService {
    private final ClazzMapper clazzMapper;
    /**
     * 根据班级ID获取班级和对应⽼师
     */
    public Clazz getClazzWithTeacher(Long clazzId) {
        Clazz clazz = clazzMapper.selectById(clazzId);
        if (clazz != null) {
            Teacher teacher = clazzMapper.selectTeacherByClazzId(clazz.getTeacherId());
            clazz.setTeacher(teacher);
        }
        return clazz;
    }
/*
 *根据班级id获取改版机索引的学生信息
 *
 */
// 获取班级及其学生信息
public Clazz getClazzWithStudent(Long clazzId) {
    // 先查询班级信息
    Clazz clazz = clazzMapper.selectClazzById(clazzId);

    // 查询并设置班级对应的学生列表
    List<Student> students = clazzMapper.selectStudentsByClazzId(clazzId);
    clazz.setStudents(students);

    return clazz;
}

}
