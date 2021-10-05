package hu.tmx.aop.exampleOne.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After(value = "execution(* hu.tmx.aop.exampleOne.service.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        logger.info("after execution of {}", joinPoint);
    }

    @AfterReturning(value = "execution(* hu.tmx.aop.exampleOne.service.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
            logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "execution(* hu.tmx.aop.exampleOne.service.*.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("{} returned with value {}", joinPoint, exception);
    }
}
