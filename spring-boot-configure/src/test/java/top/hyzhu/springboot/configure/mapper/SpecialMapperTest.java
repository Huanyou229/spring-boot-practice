package top.hyzhu.springboot.configure.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.springboot.configure.entity.Special;

import java.util.List;


/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 21:41
 **/
@SpringBootTest
class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void findAll() {
        List<Special> all = specialMapper.findAll();
        all.forEach(System.out::println);
    }
}