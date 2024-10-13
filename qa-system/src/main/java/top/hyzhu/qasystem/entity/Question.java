package top.hyzhu.qasystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description: Question
 * @Date: 2024-10-12 21:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime createTime;
}