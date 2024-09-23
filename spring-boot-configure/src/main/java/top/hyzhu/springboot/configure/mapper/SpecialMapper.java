package top.hyzhu.springboot.configure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.hyzhu.springboot.configure.entity.Special;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 21:39
 **/
@Mapper
public interface SpecialMapper {
    @Select("SELECT * FROM list ORDER BY updated DESC")
    List<Special> findAll();
}
