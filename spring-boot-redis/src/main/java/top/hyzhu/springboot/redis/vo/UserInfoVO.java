package top.hyzhu.springboot.redis.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: zhy
 * @Description: UserInfoVO
 * @Date: 2024-10-21 17:37
 **/

@Data
@Schema(description = "⽤户信息")
public class UserInfoVO implements Serializable {
    @Serial
    private static final long serialVersionUID = -45095106764580159L;
    @Schema(description = "主键")
    private Long pkId;
    @Schema(description = "⼿机号")
    private String phone;
    @Schema(description = "头像")
    private String avatar;
    @Schema(description = "昵称")
    private String nickname;
    @Schema(description = "性别")
    private Integer gender;
    @Schema(description = "积分")
    private Integer bonus;
    @Schema(description = "描述")
    private String remark;
}
