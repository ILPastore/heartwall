package com.pastore.bizapp.config;

import com.pastore.evolution.aop.AbstractControllerAspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class ControllerLogAop extends AbstractControllerAspect {

    @Override
    @Pointcut("execution(* com.pastore.bizapp.controller.*.*(..))")
    public void pointCutControllerMethod() {
    }
}
