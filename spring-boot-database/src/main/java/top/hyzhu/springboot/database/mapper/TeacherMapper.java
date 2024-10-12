package top.hyzhu.springboot.database.mapper;

import top.hyzhu.springboot.database.entity.Teacher;

/**
 * @Author: zhy
 * @Description: TeacherMapper
 * @Date: 2024-10-12 14:07
 **/
public interface TeacherMapper {
    Teacher findTeacherById(int teacherId);
}
