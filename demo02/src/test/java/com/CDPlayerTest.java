package com;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @autor Long Qiong
 * @create 2017/10/26
 */
//在测试开始时自动创建Spring应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//需要在CDPlayerConfig中加载配置
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest implements ApplicationContextAware{
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldBeNull(){
        assertNotNull(cd);
    }

//    @Autowired
    private MediaPlayer player;

    //StandardOutputStreamLog来源于System Rules库的一个JUnit规则，该规则能够基于控制台的输出编写断言
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void play(){
        System.out.println(context.getBean(MediaPlayer.class).getClass());
        System.out.println(context.getBean(CDPlayer.class).getClass());
        String[] s =context.getBeanNamesForType(CDPlayer.class);
        System.out.println(context.getApplicationName());
        System.out.println(context.getId());
        System.out.println(context.getParent());
        System.out.println(context.getBeansOfType(CompactDisc.class));
        Map m = context.getBeansOfType(CompactDisc.class);
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
                log.getLog());
    }

    @Test
    public void testMultiBeanByClass(){
        System.out.println(context.getBean("cdPlayer").toString());
        System.out.println(context.getBean("anotherCDPlayer").toString());


    }

    private ApplicationContext context;

    //实现ApplicationContextAware 获取上下文
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
