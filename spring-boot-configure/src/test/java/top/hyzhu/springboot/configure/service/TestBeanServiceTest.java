package top.hyzhu.springboot.configure.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 19:13
 **/

@SpringBootTest
class TestBeanServiceTest {
//    手动读取
    //注⼊Spring上下⽂
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService");
        System.out.println(testBeanService.getName());
    } }