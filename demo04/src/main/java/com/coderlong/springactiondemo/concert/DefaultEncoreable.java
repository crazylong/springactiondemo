package com.coderlong.springactiondemo.concert;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("演得太好了，再来一场！！！");
    }
}
