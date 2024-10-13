package top.hyzhu.qasystem.mapper;
import top.hyzhu.qasystem.entity.User;

/**
 * @Author: zhy
 * @Description: UserMapper
 * @Date: 2024-10-12 21:35
 **/
public interface UserMapper {
    // 通过用户名和密码查找用户
    User findByUsernameAndPassword(String username,String password);
    int insertUser(User user);
}
