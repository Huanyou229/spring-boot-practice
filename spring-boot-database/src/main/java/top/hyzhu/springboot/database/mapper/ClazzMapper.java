package top.hyzhu.springboot.database.mapper;

import top.hyzhu.springboot.database.entity.Clazz;

/**
 * @Author: zhy
 * @Description: ClazzMapper
 * @Date: 2024-10-12 14:19
 **/
public interface ClazzMapper {
    Clazz getClazzById(int clazzId);
    Clazz getClazz(int clazzId);
}
