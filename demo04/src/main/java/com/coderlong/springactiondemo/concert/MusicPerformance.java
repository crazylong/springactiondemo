package com.coderlong.springactiondemo.concert;

import org.springframework.stereotype.Component;

/**
 * @autor Long Qiong
 * @create 2017/11/2
 */
@Component
public class MusicPerformance implements Performance {
    @Override
    public void perform() throws Exception {
        //throw new Exception();
        System.out.println("Andy music performance");
    }


}
