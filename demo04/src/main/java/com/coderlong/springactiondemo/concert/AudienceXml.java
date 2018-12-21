package com.coderlong.springactiondemo.concert;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 * 通过xml 声明切面
 */
public class AudienceXml {
    public void silenceCellPhones(){
        System.out.println("XML Silencing cell phones");
    }

    public void takeSeats(){
        System.out.println("XML Taking seats");
    }

    public void applause(){
        System.out.println("XML CLAP CLAP CLAP!!!");
    }

    public void demandRefund(){
        System.out.println("XML Demanding a refund");
    }
}
