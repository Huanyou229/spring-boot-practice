package top.hyzhu.qasystem.Service;

import top.hyzhu.qasystem.entity.User;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-13 13:07
 **/
public interface UserService {
    void register(User user);
    // 用户登录，返回登录成功的用户对象
    User login(String username, String password);
}
