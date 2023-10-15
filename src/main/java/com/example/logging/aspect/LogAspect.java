package com.example.logging.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @AfterThrowing(
        pointcut = "bean(*Service)",
        throwing = "ex")
    private void logException(JoinPoint joinpoint, RuntimeException ex) {
        String exName = ex.getClass().getSimpleName();
        String exMessage = ex.getMessage();
        String methodName = joinpoint.getSignature().toShortString();
        log.info("[EX] Method=[{}] Exception=[{}] - {}", methodName, exName, exMessage);
    }
}
