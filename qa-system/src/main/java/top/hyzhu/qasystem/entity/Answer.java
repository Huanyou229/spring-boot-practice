package top.hyzhu.qasystem.entity;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description: Answer
 * @Date: 2024-10-12 21:33
 **/
public class Answer {
    private Long id;
    private Long questionId;
    private Long userId;
    private String content;
    private LocalDateTime createTime;
}
