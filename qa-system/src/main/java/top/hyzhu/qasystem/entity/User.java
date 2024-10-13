package top.hyzhu.qasystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description: Use
 * @Date: 2024-10-12 21:25
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createTime;
}