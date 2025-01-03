package top.hyzhu.springboot.redis.utils;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 14:54
 **/
public class CommonUtils {

    /**
     * 校验⼿机号码
     *
     * @param phone 电话
     * @return boolean
     */
    public static boolean checkPhone(String phone) {
        if (phone == null || phone.length() != 11) {
            return false;
        }
        // 中国⼤陆⼿机号码的正则表达式，可能需要根据实际情况进⾏调整
        String regex = "^1[3-9]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    /*
    * 生成四位随机验证码
    *
    * return int
    * */
    public static int generateCode(){
        return ThreadLocalRandom.current().nextInt(1000,9999);
    }
}
