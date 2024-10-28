package top.hyzhu.springboot.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: zhy
 * @Description: TaskApplication
 * @Date: 2024-10-28 14:09
 **/
@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = {"top.hyzhu.springboot.task.mapper"})
public class TaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}
