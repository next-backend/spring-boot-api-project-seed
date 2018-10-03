package com.company.project.configurer;

import com.alibaba.fastjson.JSON;
import com.company.project.core.ResultGenerator;
import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class RequestIntercepter {

    @Around("execution(* com.company.project.web.*.*(..))")
    public Object doAroundAdvice(ProceedingJoinPoint jp) {
        long startTime = System.currentTimeMillis();
        Class target = jp.getTarget().getClass();
        log.info("\nrequest start :\nApi: {}, \nArgs: {}", getMethodInfo(jp), JSON.toJSONString(jp.getArgs()));
        try {
            //obj之前可以写目标方法执行前的逻辑
            Object obj = jp.proceed();
            long endTime = System.currentTimeMillis();
            log.info("\nResult: {}, \nduration: {}ms", JSON.toJSONString(obj), endTime - startTime);
            log.info("request end");
            return obj;
        } catch (Throwable e) {
            long endTime = System.currentTimeMillis();
            log.error("\nrequest error: \nresult : {}, \n耗时 : {}ms", e, endTime - startTime);
            log.info("request end");
        }
        return null;
    }


    private String getMethodInfo(ProceedingJoinPoint jp) {
        StringBuilder builder = new StringBuilder();
        builder.append(jp.getTarget().getClass());
        builder.append(".");
        Signature st = jp.getSignature();
        MethodSignature ms = (MethodSignature) st;
        String[] args = ms.getParameterNames();
        builder.append(ms.getMethod().getName())
                .append("(")
                .append(Joiner.on(",").join(args))
                .append(")");
        return builder.toString();
    }
}
