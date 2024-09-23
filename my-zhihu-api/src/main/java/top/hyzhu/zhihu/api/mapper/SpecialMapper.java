package top.hyzhu.zhihu.api.mapper;

import top.hyzhu.zhihu.api.entity.Special;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:26
 **/
public interface SpecialMapper{
    List<Special> selectAll();
    List<Special> selectByPage(int limit,int offset);
}

