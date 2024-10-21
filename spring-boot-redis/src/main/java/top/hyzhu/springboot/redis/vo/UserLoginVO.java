package top.hyzhu.springboot.redis.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: zhy
 * @Description: UserLoginVO
 * @Date: 2024-10-21 16:35
 **/
@Data
@Schema(description = "⽤户登录vo")
public class UserLoginVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 8212240698099812005L;
    @Schema(description = "⽤户ID")
    private Long pkId;
    @Schema(description = "⼿机号")
    private String phone;
    @Schema(description = "令牌")
    private String accessToken; }
