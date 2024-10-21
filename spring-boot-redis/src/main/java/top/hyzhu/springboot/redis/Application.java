package top.hyzhu.springboot.redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 13:48
 **/
@SpringBootApplication
@MapperScan(basePackages = {"top.hyzhu.springboot.redis.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}