package top.hyzhu.springboot.exception.annotation;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * @Author: zhy
 * @Description: PhoneValidator
 * @Date: 2024-10-15 15:29
 **/
public class PhoneValidator implements ConstraintValidator<Phone, String> {
    // ⼿机号正则表达式
    private static final String REGEX_PHONE = "^1[3456789]\\d{9}$";
    @Override
    public void initialize(Phone phone) {
    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(value)) {
            // 忽略空值，由@NotBlank注解校验
            return true;
        }
        return Pattern.matches(REGEX_PHONE, value);
    } }