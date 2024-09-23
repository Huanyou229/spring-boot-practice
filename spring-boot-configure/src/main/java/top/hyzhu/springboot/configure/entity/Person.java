package top.hyzhu.springboot.configure.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 14:45
 **/
@Data
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private UUID id;
    private String phone;
}
