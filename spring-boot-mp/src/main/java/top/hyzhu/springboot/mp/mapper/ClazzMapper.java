package top.hyzhu.springboot.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.hyzhu.springboot.mp.entity.Clazz;
import top.hyzhu.springboot.mp.entity.Course;
import top.hyzhu.springboot.mp.entity.Student;
import top.hyzhu.springboot.mp.entity.Teacher;

import java.util.List;

/**
 * @Author: zhy
 * @Description: ClazzMapper
 * @Date: 2024-10-14 15:41
 **/
public interface ClazzMapper extends BaseMapper<Clazz> {

    // 查询班级信息
    @Select("SELECT * FROM clazz WHERE id = #{clazzId}")
    Clazz selectClazzById(Long clazzId);

    @Select("SELECT * FROM teacher WHERE id = #{teacherId}")
    Teacher selectTeacherByClazzId(Long teacherId);

    @Select("select * from student where clazz_id = #{clazzId}")
    List<Student> selectStudentsByClazzId(Long clazzId);
}

