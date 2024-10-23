package top.hyzhu.springboot.qa.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 23:34
 **/


@Data
public class User {

    private Long id;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
    private String avatar;
    private String phone;
    private String email;

    // ⾃动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    @JsonIgnore // 忽略序列化
    private LocalDateTime createTime;
    // ⾃动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonIgnore // 忽略序列化
    private LocalDateTime updateTime;
}

