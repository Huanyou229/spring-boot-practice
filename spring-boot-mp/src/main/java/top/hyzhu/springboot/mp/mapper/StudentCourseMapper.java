package top.hyzhu.springboot.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.hyzhu.springboot.mp.entity.Course;
import top.hyzhu.springboot.mp.entity.StudentCourse;

import java.util.List;

/**
 * @Author: zhy
 * @Description: StudentCourseMapper
 * @Date: 2024-10-14 15:43
 **/
public interface StudentCourseMapper extends BaseMapper<StudentCourse> {
    @Select("SELECT c.* FROM course c INNER JOIN student_course sc ON c.id = sc.course_id WHERE sc.student_id = #{studentId}")
    List<Course> selectCoursesByStudentId(Long studentId); }
