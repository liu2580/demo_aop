package com.example.demo_aop.Service;

import org.springframework.stereotype.Service;

/**
 * @author liutianqi
 * @date 2019/11/24
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void printHello() {
        System.out.println("hello");
    }
}
