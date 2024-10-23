package top.hyzhu.springboot.qa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhy
 * @Description: 启动主类
 * @Date: 2024-10-21 23:29
 **/

@SpringBootApplication
@MapperScan(basePackages = "top.hyzhu.springboot.qa.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}