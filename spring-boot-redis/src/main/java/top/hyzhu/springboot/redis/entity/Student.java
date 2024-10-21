package top.hyzhu.springboot.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 14:08
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {


    @Serial
    private static final long serialVersionUID = 7530974609494315991L;

    private String id;
    private String name;
    private Address address;
}
