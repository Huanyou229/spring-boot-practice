package top.hyzhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.entity.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhy
 * @Description: 用户服务层
 * @Date: 2024-09-02 19:42
 **/
@Service
public class UserService {
    private final List<User> users =List.of(
            new User(1L,"张三",23),
            new User(2L,"张三风",2),
            new User(3L,"张三丰",18),
            new User(4L,"张三封",27),
            new User(5L,"张三疯",16)

    );
    public List<String> getAdultsUserName(){
        return users.stream()
                .filter(user -> user.getAge() > 18)
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
