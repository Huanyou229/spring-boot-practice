package top.hyzhu.springboot.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-12 19:20
 **/
@SpringBootTest
@Slf4j
class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void findAll() {
        specialMapper.findAll().forEach(System.out::println);
    }
}