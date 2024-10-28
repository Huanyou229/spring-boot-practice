package top.hyzhu.springboot.qa.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 23:36
 **/
@Data
@TableName("question")
public class Question {
    private Long id;
    private String title;
    private String content;
    private Long userId;

    // ⾃动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createTime;
    // ⾃动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updateTime;

//    用于一对一查询
    @TableField(exist = false)
    private User user;
}

