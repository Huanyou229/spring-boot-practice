package top.hyzhu.springboot.redis.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.hyzhu.springboot.redis.entity.User;

/**
 * @Author: zhy
 * @Description: UserMapper
 * @Date: 2024-10-21 16:41
 **/
public interface UserMapper extends BaseMapper<User> {

    default User getByPhone(String phone){
        return this.selectOne(new LambdaQueryWrapper<User>().eq(User::getPhone, phone));
    } }