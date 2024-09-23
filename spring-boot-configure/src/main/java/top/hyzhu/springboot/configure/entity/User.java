package top.hyzhu.springboot.configure.entity;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 14:58
 **/
@Data
public class User {
    @NotNull
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;

    @Min(18)
    @Max(100)
    private int age;

    @Pattern(regexp = "^[0-9]{11}$")
    private String phoneNumber;

    @Future
    private LocalDate subscriptionEndDate;

    @Positive
    private int score;

    @URL
    private String website;
}
