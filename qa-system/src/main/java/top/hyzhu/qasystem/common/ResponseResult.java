package top.hyzhu.qasystem.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:47
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseResult {
private Integer code;
private String msg;
private Object data;
}