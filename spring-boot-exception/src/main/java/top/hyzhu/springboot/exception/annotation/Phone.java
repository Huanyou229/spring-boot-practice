package top.hyzhu.springboot.exception.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: zhy
 * @Description: Phone
 * @Date: 2024-10-15 15:27
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneValidator.class)
public @interface Phone {
    String message() default "⼿机号格式不正确";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {}; }
