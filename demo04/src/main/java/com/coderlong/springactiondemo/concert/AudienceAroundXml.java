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
public class AudienceAroundXml {

    //环绕通知方法
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
