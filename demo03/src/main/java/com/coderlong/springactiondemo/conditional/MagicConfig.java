package com.coderlong.springactiondemo.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @autor Long Qiong
 * @create 2017/10/27
 */
@Configuration
@PropertySource("classpath:/com/soundsystem/app.properties")
public class MagicConfig {
    @Autowired
    Environment env;
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }

    @Bean
    public BlankDisc disc(){
        return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
    }
}
