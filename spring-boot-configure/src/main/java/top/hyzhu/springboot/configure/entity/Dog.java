package top.hyzhu.springboot.configure.entity;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 15:37
 **/

@Data
@Component
public class Dog {
    @Value("${student.dog.name}")
    private String name;

    @Value("${student.dog.age}")
    private Integer age;
}

