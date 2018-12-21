package com.coderlong.springactiondemo.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 */
@Aspect
@Component
public class AudienceAround {
    //定义命名切点
    @Pointcut("execution(* com.coderlong.springactiondemo.concert.Performance.perform(..))")
    public void performance() {
    }

    //环绕通知方法
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Around Silencing cell phones");
            System.out.println("Around Taking seats");

            jp.proceed();

            System.out.println("Around CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Around Demanding a refund");
        }

    }
}
