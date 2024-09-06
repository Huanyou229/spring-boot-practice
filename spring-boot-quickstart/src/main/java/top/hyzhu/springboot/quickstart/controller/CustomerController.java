package top.hyzhu.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.quickstart.enums.RequestType;
import top.hyzhu.springboot.quickstart.service.CustomerService;
import org.springframework.web.bind.annotation.*;
/**
 * @Author: zhy
 * @Description: CustomerController
 * @Date: 2024-09-02 18:48
 **/
@RestController
@RequestMapping("/requests")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @GetMapping("/{type}")
    public String handleRequest(@PathVariable RequestType type){
        return customerService.handleRequest(type);
    }
}

