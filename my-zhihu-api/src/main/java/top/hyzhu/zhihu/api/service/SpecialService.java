package top.hyzhu.zhihu.api.service;

import top.hyzhu.zhihu.api.entity.Special;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:37
 **/
public interface SpecialService {
    List<Special> getAll();
    List<Special> getByPage(int limit,int offset);
}
