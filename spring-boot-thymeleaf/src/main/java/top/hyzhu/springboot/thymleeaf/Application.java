package top.hyzhu.springboot.thymleeaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-09 13:53
 **/
@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    @GetMapping
    public String hello(String name){
        String greeting = "Hello!!!! " + name + "!";
        return greeting;
    }
//     迭代计算阶乘
    @GetMapping("/factorial")
    public Integer factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("数字必须为非负数");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

