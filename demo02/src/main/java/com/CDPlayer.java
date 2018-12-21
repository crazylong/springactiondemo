package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @autor Long Qiong
 * @create 2017/10/26
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    //  @Autowired
    //  public void setCd(CompactDisc cd) {
    //    this.cd = cd;
    //  }

    //  @Autowired
    //  public void insertDisc(CompactDisc cd){
    //    this.cd = cd;
    //  }

    //采用Autowired自动装配
    //不管是构造器、Setter方法还是其他的方法，Spring都会尝试满足方法参数上所声明的依赖。
    //如果没有匹配的bean，那么在应用上下文创建的时候，Spring会抛出一个异常。为了避免异常出现，可以将
    //@Autowired的required属性设置为false
    //如果有多个bean都能满足依赖关系的话，Spring将会抛出一个异常，表明没有明确指定要选择哪个bean进行自动装配。
    //大多数场景，可以用@Inject替换
    @Autowired(required = false)
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
