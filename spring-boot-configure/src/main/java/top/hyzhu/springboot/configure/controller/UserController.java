package top.hyzhu.springboot.configure.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.configure.entity.User;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 15:06
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@Valid @RequestBody User user){
        return "用户有效";
    }
}
