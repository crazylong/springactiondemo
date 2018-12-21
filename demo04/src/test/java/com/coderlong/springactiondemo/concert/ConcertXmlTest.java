package com.coderlong.springactiondemo.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;

/**
 * @autor Long Qiong
 * @create 2017/11/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "/concert.xml")
@ContextConfiguration(locations = {"classpath:/concert.xml", "/encoreable.xml"})
public class ConcertXmlTest implements ApplicationContextAware {
    @Autowired
    private Performance performance;

    @Test
    public void test01() throws Exception {
        performance.perform();
    }


    /**
     * 通过切面引入新功能测试
     * @throws Exception
     */
    @Test
    public void testExtendMethod() throws Exception {
        //1.
        //        Performance performance1 = (Performance)context.getBean("musicPerformance");
        //        performance1.perform();
        //        Encoreable encoreable = (Encoreable)context.getBean("musicPerformance");
        //        encoreable.performEncore();

        //2.
        //        Encoreable encoreable = (Encoreable)performance;
        //        encoreable.performEncore();

        //3.
        try {
            Method method = Performance.class.getMethod("perform", null);
            Method method2 = Encoreable.class.getMethod("performEncore", null);
            method.invoke(performance, null);
            method2.invoke(performance, null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
