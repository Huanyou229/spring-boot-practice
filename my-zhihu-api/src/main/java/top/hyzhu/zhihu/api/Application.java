package top.hyzhu.zhihu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:12
 **/
@SpringBootApplication
@MapperScan(basePackages = {"top.hyzhu.zhihu.api.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
