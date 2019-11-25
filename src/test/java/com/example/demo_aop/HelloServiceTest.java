package com.example.demo_aop;

import com.example.demo_aop.Service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liutianqi
 * @date 2019/11/24
 */

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;
    @Test
    public void printHello() {
        helloService.printHello();
    }
}
