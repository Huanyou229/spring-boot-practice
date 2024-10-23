package top.hyzhu.springboot.qa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.hyzhu.springboot.qa.entity.User;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 23:43
 **/

public interface UserMapper extends BaseMapper<User> {

    // 根据用户名和密码查询用户
    @Select("SELECT id, username, password, avatar, phone, email, create_time, update_time FROM user WHERE username = #{username} AND password = #{password}")
    User selectByUsernameAndPassword(String username, String password);
}