package top.hyzhu.springboot.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: zhy
 * @Description: Clazz
 * @Date: 2024-10-12 13:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Clazz {
    private Integer clazzId;
    private String clazzName;
    private Integer teacherId;
    private Teacher teacher;
    private List<Student> students;

}
