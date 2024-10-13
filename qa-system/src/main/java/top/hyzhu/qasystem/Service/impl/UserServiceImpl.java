package top.hyzhu.qasystem.Service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.hyzhu.qasystem.Service.UserService;
import top.hyzhu.qasystem.entity.User;
import top.hyzhu.qasystem.mapper.UserMapper;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-13 13:08
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        // 插入用户数据
        userMapper.insertUser(user);
    }

    @Override
    public User login(String username, String password) {
        // 调用 UserMapper 通过用户名和密码查询用户
        return userMapper.findByUsernameAndPassword(username, password);
    }
}