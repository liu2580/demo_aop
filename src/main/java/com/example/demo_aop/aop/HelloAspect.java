package com.example.demo_aop.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author liutianqi
 * @date 2019/11/24
 */
@Aspect
public class HelloAspect {
    @Before("execution(* com.example.demo_aop.Service.HelloServiceImpl.printHello(..))")
    public void before(){
        System.out.println("before------");
    }
    @After("execution(* com.example.demo_aop.Service.HelloServiceImpl.printHello(..))")
    public void after(){
        System.out.println("after------");
    }
    @AfterReturning("execution(* com.example.demo_aop.Service.HelloServiceImpl.printHello(..))")
    public void afterReturning(){
        System.out.println("afterReturning------");
    }
    @AfterThrowing("execution(* com.example.demo_aop.Service.HelloServiceImpl.printHello(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing------");
    }

}
