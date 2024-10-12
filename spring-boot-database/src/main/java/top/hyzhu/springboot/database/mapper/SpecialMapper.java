package top.hyzhu.springboot.database.mapper;

import top.hyzhu.springboot.database.entity.Special;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-12 18:50
 **/
public interface SpecialMapper {
    List<Special> findAll();
}
