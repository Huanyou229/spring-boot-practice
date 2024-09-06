package top.hyzhu.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.quickstart.service.UserService;

import java.util.List;

/**
 * @Author: zhy
 * @Description: UserController
 * @Date: 2024-09-02 19:49
 **/
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;;

    @GetMapping("/adults")
    public List<String> getAdultsUserName() {
        return userService.getAdultsUserName();
    }
}
