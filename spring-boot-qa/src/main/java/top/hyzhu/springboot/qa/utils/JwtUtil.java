package top.hyzhu.springboot.qa.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

/**
 * @author Huany
 */
public class JwtUtil {

    // 生成符合HS256算法要求的安全密钥
    private static final Key KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // 生成 JWT token
    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                // 1小时有效期
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))
                // 使用 HS256 算法签名
                .signWith(KEY)
                .compact();
    }

    // 验证 JWT token 是否有效
    public static boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(KEY).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // 从 JWT token 中解析出用户名
    public static String getUsernameFromToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
