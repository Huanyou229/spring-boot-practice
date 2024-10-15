package top.hyzhu.springboot.mp.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description: User
 * @Date: 2024-10-14 14:22
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    // ⾃动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    // ⾃动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    // 逻辑删除字段
    @TableLogic
    private Integer deleted; }
