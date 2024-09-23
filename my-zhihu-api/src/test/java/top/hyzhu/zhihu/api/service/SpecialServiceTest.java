package top.hyzhu.zhihu.api.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.zhihu.api.entity.Special;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:43
 **/
@SpringBootTest
class SpecialServiceTest {
    @Resource
    private SpecialService specialService;

    @Test
    void getAll() {
        List<Special> all = specialService.getAll();
        all.forEach(System.out::println);
    }

    @Test
    void getByPage() {
        List<Special> all = specialService.getByPage(2, 0);
        all.forEach(System.out::println);
    }
}