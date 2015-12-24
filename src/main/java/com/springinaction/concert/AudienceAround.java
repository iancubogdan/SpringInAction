package com.springinaction.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by iancu_000 on 06-Dec-15.
 */
@Aspect
public class AudienceAround {

    @Pointcut("execution(* com.com.springinaction.concert.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
