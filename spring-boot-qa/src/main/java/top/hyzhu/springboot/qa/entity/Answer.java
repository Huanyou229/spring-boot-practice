package top.hyzhu.springboot.qa.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 23:36
 **/

@Data
@TableName("answer")
public class Answer {
    private Long id;
    private Long questionId;
    private String content;
    private Long userId;

    // ⾃动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // ⾃动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    // 关联回答者信息
    @TableField(exist = false)
    private User user;

}
