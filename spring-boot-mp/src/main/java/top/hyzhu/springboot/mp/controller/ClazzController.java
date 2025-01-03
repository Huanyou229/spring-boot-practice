package top.hyzhu.springboot.mp.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.mp.entity.Clazz;
import top.hyzhu.springboot.mp.service.ClazzService;

/**
 * @Author: zhy
 * @Description: ClazzController
 * @Date: 2024-10-14 15:54
 **/

@RestController
@RequestMapping("/clazz")
@AllArgsConstructor
public class ClazzController {
    private final ClazzService clazzService;
    /**
     * 获取班级和对应⽼师信息
     */
    @GetMapping("/{id}")
    public Clazz getClazzWithTeacher(@PathVariable Long id) {
        return clazzService.getClazzWithTeacher(id);
    }

    /* 查询一个班级的所有学生信息*/
    @GetMapping("/{clazzId}/students")
    public Clazz getClazzWithStudents(@PathVariable Long clazzId) {
    return clazzService.getClazzWithStudent(clazzId);
}
}
