package top.hyzhu.springboot.mp.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.mp.entity.User;
import top.hyzhu.springboot.mp.service.UserService;

import java.util.List;

/**
 * @Author: zhy
 * @Description: UserController
 * @Date: 2024-10-14 14:30
 **/
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    // 创建⽤户
    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        boolean result = userService.createUser(user);
        return result ? "⽤户创建成功" : "⽤户创建失败";
    }

    // 更新⽤户
    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        boolean result = userService.updateUser(user);
        return result ? "⽤户更新成功" : "⽤户更新失败";
    }

    // 删除⽤户（逻辑删除）
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean result = userService.deleteUserById(id);
        return result ? "⽤户删除成功" : "⽤户删除失败";
    }

    // 根据ID查询⽤户
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // 按名字模糊查询⽤户
    @GetMapping("/name")
    public List<User> getUsersByName(@RequestParam String name) {
        return userService.getUsersByName(name);
    }
    // 分⻚查询⽤户
    @GetMapping("/page")
    public Page<User> getUsersByPage(@RequestParam int currentPage, @RequestParam int pageSize) {
        return userService.getUsersByPage(currentPage, pageSize);
    }
    // 根据Id批量查找用户
    @GetMapping("/batch/{ids}")
    public List<User> getUsersByIds(@PathVariable List<Long> ids) {
        return userService.getUsersByIds(ids);
    }
    //根据id批量更新用户信息
//    @PutMapping("/batch/update/{ids}")
//    public String updateUserByIds(@PathVariable List<Long> ids, @RequestBody User user) {
//        boolean result = userService.updateUserByIds(ids, user);
//        return result ? "⽤户更新成功" : "⽤户更新失败";
//    }

}