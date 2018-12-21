package com.coderlong.springactiondemo.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @autor Long Qiong
 * @create 2017/10/27
 */
public class MagicExistsCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Environment env = conditionContext.getEnvironment();
        //env.getProperty
        return env.containsProperty("magic");
    }
}
