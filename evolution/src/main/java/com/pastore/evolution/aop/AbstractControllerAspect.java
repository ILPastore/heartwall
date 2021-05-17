package com.pastore.evolution.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import java.util.Arrays;

/**
 * controller层aop抽象类
 *
 * @author Qiao.Zhang
 * @version 1.0
 * @date 2021/5/17 下午4:43
 */
@Slf4j
public abstract class AbstractControllerAspect {

    public abstract void pointCutControllerMethod();

    @Around("pointCutControllerMethod()")
    private Object doAroundService(ProceedingJoinPoint pjp) {
        Object result = null;
        try {
            log.info("服务开始调用：{}，请求参数：{}", pjp.getSignature().toString(), Arrays.toString(pjp.getArgs()));
            long begin = System.nanoTime();
            result = pjp.proceed();
            long end = System.nanoTime();
            log.info("服务结束调用：{}，请求参数：{}，cost time：{} ns，cost：{} ms",
                    pjp.getSignature().toString(), Arrays.toString(pjp.getArgs()), (end - begin), (end - begin) / 1000000);
        } catch (Throwable e) {
            log.error("服务调用异常：{}，请求参数：{}", new Object[] {pjp.getSignature().toString(),
                    Arrays.toString(pjp.getArgs()), e});
        }

        return result;
    }
}
