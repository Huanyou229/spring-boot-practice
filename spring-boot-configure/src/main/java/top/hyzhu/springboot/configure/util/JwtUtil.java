package top.hyzhu.springboot.configure.util;

import cn.hutool.jwt.JWTUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import top.hyzhu.springboot.configure.config.JwtConfig;

import java.util.Date;
import java.util.Map;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 22:04
 **/
@Component
public class JwtUtil {
    @Resource
    private JwtConfig jwtConfig;

    /**
     * 生成JWT
     *
     * @param claims 载荷信息
     * @return 生成的JWT字符串
     */
    public String generateToken(Map<String, Object> claims) {
        claims.put("exp", new Date(System.currentTimeMillis() + jwtConfig.getExpiration()));
        return JWTUtil.createToken(claims, jwtConfig.getSecret().getBytes());
    }

//    /**
//     * 验证JWT是否合法
//     *
//     * @param token JWT字符串
//     * @return 验证结果
//     */
//    public boolean validateToken(String token) {
//        return JWTUtil.verify(token, jwtConfig.getSecret().getBytes());
//    }
}
