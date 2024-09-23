package top.hyzhu.springboot.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 13:54
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

