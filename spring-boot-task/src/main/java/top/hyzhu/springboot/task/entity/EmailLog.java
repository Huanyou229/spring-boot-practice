package top.hyzhu.springboot.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-28 15:34
 **/
@Data
@TableName("email_log")
public class EmailLog {
    @TableId(type= IdType.AUTO)
    private Long id;
    private String recipient;
    private String subject;
    private String content;
    private LocalDateTime sentAt;
}
