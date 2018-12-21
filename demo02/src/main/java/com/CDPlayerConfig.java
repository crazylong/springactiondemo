package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @autor Long Qiong
 * @create 2017/10/26
 */
@Configuration
@ComponentScan //默认会扫描与配置类相同的包及这个包下的所有子包
//@ComponentScan("com.coderlong.springactiondemo.soundsystem")
//@ComponentScan(basePackages = {"com.coderlong.springactiondemo.soundsystem", "com.coderlong.springactiondemo.vedio"})
public class CDPlayerConfig {
//    //默认bean名同方法名 可以用 name显示设置
//    @Bean(name = "lonelyHeartsClubBand")
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }
//
//    @Bean
//    public CDPlayer cdPlayer(){
//        //看起来，CompactDisc是通过调用sgtPeppers()得到的，因为sgtPeppers()添加了@Bean注解，Spring 会拦截所有对它的调用，并确保直接返回该方法所创建的bean
//        return new CDPlayer(sgtPeppers());
//    }
//
//    @Bean
//    public CDPlayer anotherCDPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }
//
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc){
//        return new CDPlayer(compactDisc);
//    }
}
