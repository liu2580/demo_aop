package com.example.demo_aop.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liutianqi
 * @date 2019/11/24
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.demo_aop.aop")
public class AopConfig {
    @Bean
    public HelloAspect getHelloAspct(){
        return new HelloAspect();
    }
}
