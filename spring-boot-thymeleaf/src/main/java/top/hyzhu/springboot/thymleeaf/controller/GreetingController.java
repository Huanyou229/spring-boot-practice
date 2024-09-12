package top.hyzhu.springboot.thymleeaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhy
 * @Description: 调试示例代码
 * @Date: 2024-09-11 19:31
 **/
@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet(@RequestParam(value="name",defaultValue = "World") String name) {
        return sayHello(name);
    }

    private String sayHello(String name) {
        String greeting = "你好1111, " + name + "!";
        return greeting;
    }
}
