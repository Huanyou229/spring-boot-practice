package top.hyzhu.springboot.redis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @Author: zhy
 * @Description: AccountStatusEnum
 * @Date: 2024-10-21 16:34
 **/
@Getter
@AllArgsConstructor
public enum AccountStatusEnum {
    /**
     * 停⽤
     */
    DISABLE(0, "停⽤"),
    /**
     * 正常
     */
    ENABLED(1, "正常");
    private final int value;
    private final String name;
    public static String getNameByValue(int value) {
        for (AccountStatusEnum s : AccountStatusEnum.values()) {
            if (s.getValue() == value) {
                return s.getName();
            }
        }
        return "";
    }
    public static Integer getValueByName(String name) {
        for (AccountStatusEnum s : AccountStatusEnum.values()) {
            if (Objects.equals(s.getName(), name)) {
                return s.getValue();
            }
        }
        return null;
    } }
