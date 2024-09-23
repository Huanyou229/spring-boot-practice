package top.hyzhu.springboot.configure.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 14:34
 **/
@SpringBootTest
class FamilyTest {
    @Resource
    private Family family;

    @Test
    void testFamily(){
        System.out.println(family);
    }
}