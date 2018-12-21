package com.coderlong.springactiondemo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.*;

/**
 * @autor Long Qiong
 * @create 2017/10/24
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

    @Test
    public void test01(){
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

    ClassPathXmlApplicationContext context;

    @Before
    public void beforeTest(){
        context = new ClassPathXmlApplicationContext("spring/knight.xml");
    }
}
