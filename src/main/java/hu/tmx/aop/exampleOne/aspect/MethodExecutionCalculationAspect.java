package hu.tmx.aop.exampleOne.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* hu.tmx.aop.exampleOne.service.*.*(..))")
    public Object aroundReturn(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken by {} is {}", proceedingJoinPoint, timeTaken);
        return proceedingJoinPoint.proceed();
    }

    @Around("execution(* hu.tmx.aop.exampleOne.service.*.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken by {} is {}", proceedingJoinPoint, timeTaken);
    }

}
