package top.hyzhu.springboot.thymleeaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-09 14:35
 **/
@Controller
public class MessageController {
    @GetMapping("/msg")
//    将”message” 属性传到视图
    public String getMsg(Model model) {
        model.addAttribute("message","Hello Thymeleaf11111!");
//                返回的视图名称:默认在 resources/templates/msg.html
    return "msg";
    }
}
