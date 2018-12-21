package com.coderlong.springactiondemo.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @autor Long Qiong
 * @create 2017/11/2
 */
@Configuration
@EnableAspectJAutoProxy //启用AspectJ自动代理
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }

    @Bean
    public MusicPerformance musicPerformance(){
        return new MusicPerformance();
    }
}
