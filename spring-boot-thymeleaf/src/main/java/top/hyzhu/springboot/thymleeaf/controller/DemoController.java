package top.hyzhu.springboot.thymleeaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-11 20:12
 **/
@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/greet1/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/factorial/{number}")
    public String calculateFactorial(@PathVariable int number) {
        return "Factorial of " + number + " is: " + factorial(number);
    }
    @GetMapping("/divide/{a}/{b}")
    public String divideNumbers(@PathVariable int a, @PathVariable int b) {
        return "Result of " + a + " divided by " + b + " is: " + divide(a, b);
    }
    // 计算阶乘的递归⽅法
    private int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1); }
    // 执⾏除法
    private int divide(int a, int b) {
        // 注意：这⾥可能会产⽣除以0的异常
        return a / b;
    } }