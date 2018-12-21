package com.coderlong.springactiondemo.conifg;

import com.coderlong.springactiondemo.BraveKnight;
import com.coderlong.springactiondemo.Knight;
import com.coderlong.springactiondemo.Quest;
import com.coderlong.springactiondemo.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @autor Long Qiong
 * @create 2017/10/24
 * 可取代 knight.xml配置
 */
@Configuration
public class KnightConfig {
//    @Bean
//    public Knight knight(){
//        return new BraveKnight(quest());
//    }
//
//    @Bean
//    public Quest quest(){
//        return new SlayDragonQuest(System.out);
//    }
}
