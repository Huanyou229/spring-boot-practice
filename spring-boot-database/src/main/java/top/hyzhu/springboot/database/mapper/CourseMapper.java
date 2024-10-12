package top.hyzhu.springboot.database.mapper;

import top.hyzhu.springboot.database.entity.Course;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-12 15:26
 **/
public interface CourseMapper {
    List<Course> selectAll(int courseId);

}
