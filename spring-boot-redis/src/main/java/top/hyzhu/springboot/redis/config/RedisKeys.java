package top.hyzhu.springboot.redis.config;

/**
 * @Author: zhy
 * @Description: RedisKeys,统一维护Redis 中的key
 * @Date: 2024-10-21 14:52
 **/

/*
* 验证码的key
*
* @param phone 手机号
* @return String
*
* */
public class RedisKeys {

    /**
     * 验证码 Key
     */
    public static String getSmsKey(String phone){
        return "sms:captcha:"+phone;
    }

    /**
     * accessToken Key
     */
    public static String getAccessTokenKey(String accessToken) {
        return "sys:access:" + accessToken;
    }
    /**
     * 获取⽤户 ID 密钥
     *
     * @param id id
     * @return {@link String}
     */
    public static String getUserIdKey(Long id) {
        return "sys:userId:" + id;
    }
}
