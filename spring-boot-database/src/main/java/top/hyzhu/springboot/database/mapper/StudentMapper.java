package top.hyzhu.springboot.database.mapper;
import org.apache.ibatis.annotations.Param;
import top.hyzhu.springboot.database.entity.Student;

import java.util.List;

/**
 * @Author zhy
 * @Date 2024/10/8
 * @Description
 */
public interface StudentMapper {
    int insert(Student student);

    Student findById(int studentId);

    int updateById(Student student);

    int deleteById(int studentId);

    int batchInsert(@Param("students") List<Student> students);

    int batchDelete(@Param("idList") List<Integer> ids);

    int batchUpdate(@Param("students") List<Student> students);

    List<Student> selectByDynamicSql(Student student);

    Student getStudent(int studentId);
}
