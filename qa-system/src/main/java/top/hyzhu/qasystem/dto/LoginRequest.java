package top.hyzhu.qasystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhy
 * @Description: LoginRequest
 * @Date: 2024-10-13 17:17
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String username;
    private String password;
}

