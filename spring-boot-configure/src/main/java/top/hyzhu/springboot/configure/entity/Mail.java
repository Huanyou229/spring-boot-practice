package top.hyzhu.springboot.configure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-24 2:34
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mail {
    private String to;
    private String subject;
    private String body;
}
