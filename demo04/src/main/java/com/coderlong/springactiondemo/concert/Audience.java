package com.coderlong.springactiondemo.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @autor Long Qiong
 * @create 2017/11/2
 */
//@Aspect
public class Audience {
    @Before("execution(* com.coderlong.springactiondemo.concert.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("execution(** com.coderlong.springactiondemo.concert.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(*** com.coderlong.springactiondemo.concert.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("execution(**** com.coderlong.springactiondemo.concert.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
