package com.coderlong.springactiondemo.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 */
@Aspect
public class EncoreableIntroducer {

    /*
    * 通过@DeclareParents注解,将Encoreable接口引入到Performance bean中
    * value属性指定了那种类型的bean要引入该接口，在本例中，也就是所有实现Performance的类型。
    * （标记符后面的加号表示是Performance的所有子类型，而不是Performance本身。
    * defaultImpl属性指定了为引入功能提供实现的类。
    * @DeclareParents注解所标注的静态属性指明了要引入的接口。
    * */
    @DeclareParents(value = "com.coderlong.springactiondemo.concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
