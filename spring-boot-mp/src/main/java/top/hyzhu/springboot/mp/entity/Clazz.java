package top.hyzhu.springboot.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

/**
 * @Author: zhy
 * @Description: Clazz
 * @Date: 2024-10-14 15:37
 **/
@Data
public class Clazz {
    private Long id;
    private String name;
    private Long teacherId;
    // ⽤于⼀对⼀映射
//    声明数据表中不存在的字段
    @TableField(exist = false)
    private Teacher teacher;

    @TableField(exist = false)
    private List<Student> students;
}