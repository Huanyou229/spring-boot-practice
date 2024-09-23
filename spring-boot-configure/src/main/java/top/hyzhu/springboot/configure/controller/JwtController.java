package top.hyzhu.springboot.configure.controller;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.configure.util.JwtUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 22:13
 **/
@RestController
@RequestMapping("/api/jwt")
@AllArgsConstructor
public class JwtController {

    private final JwtUtil jwtUtil;

    /**
     * 生成JWT的接口
     *
     * @param username 用户名
     * @return 返回生成的JWT
     **/
    @PostMapping("/generate")
    public Map<String, String> generateToken(@RequestParam String username) {
    Map<String,Object> claims = new HashMap<>();
    claims.put("username",username);
    String token = jwtUtil.generateToken(claims);
    Map<String, String> response = new HashMap<>();
    response.put("token",token);
    return response;
}
//    /**
//     * 验证JWT的接口
//     *
//     * @param token JWT字符串
//     * @return 返回验证结果
//     **/
//    @PostMapping("/validate")
//    public Map<String, Object> validateToken(@RequestParam String token) {
//        boolean isValid = jwtUtil.validateToken(token);
//        Map < String, Object > response = new HashMap<>();
//        response.put("valid", isValid);
//        return response;
//
//    }
}
