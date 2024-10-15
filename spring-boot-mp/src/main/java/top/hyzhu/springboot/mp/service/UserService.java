package top.hyzhu.springboot.mp.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.mp.entity.User;
import top.hyzhu.springboot.mp.mapper.UserMapper;

import java.util.List;

/**
 * @Author: zhy
 * @Description: UserService
 * @Date: 2024-10-14 14:28
 **/
@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    // 创建⽤户，⾃动填充创建时间和更新时间
    public boolean createUser(User user) {
        return this.save(user);
    }
    // 更新⽤户，⾃动填充更新时间
    public boolean updateUser(User user) {
        return this.updateById(user);
    }
    // 逻辑删除⽤户
    public boolean deleteUserById(Long id) {
        // 使⽤逻辑删除
        return this.removeById(id);
    }
    // 根据ID查询⽤户
    public User getUserById(Long id) {
        // 查询单个⽤户
        return this.getById(id);
    }
    // 按名字模糊查询⽤户
    public List<User> getUsersByName(String name) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>() ;
        // 查询未逻辑删除的数据
        queryWrapper.like(User::getName, name).eq(User::getDeleted, 0);
        return this.list(queryWrapper);
    }
    // 分⻚查询⽤户
    public Page<User> getUsersByPage(int currentPage, int pageSize) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>() ;
        // 查询未逻辑删除的数据
        queryWrapper.eq(User::getDeleted, 0);
        return this.page(new Page<>(currentPage, pageSize), queryWrapper);
    }
    // 根据Id批量查找用户
    public List<User> getUsersByIds(List<Long> ids) {
        return this.listByIds(ids);
    }
    //根据id批量更新用户信息
//    public boolean updateUserByIds(List<Long> ids, User user) {
//        return this.updateBatchById(user, ids);
//    }
}