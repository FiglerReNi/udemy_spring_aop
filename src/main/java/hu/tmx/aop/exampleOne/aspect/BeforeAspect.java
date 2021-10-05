package hu.tmx.aop.exampleOne.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Before("hu.tmx.aop.exampleOne.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
//    @Before("hu.tmx.aop.exampleOne.aspect.CommonJoinPointConfig.beanContainsDao()")
//    @Before("hu.tmx.aop.exampleOne.aspect.CommonJoinPointConfig.beanStartingDao()")
//    @Before("hu.tmx.aop.exampleOne.aspect.CommonJoinPointConfig.allLayerExecution()")
//    @Before("hu.tmx.aop.exampleOne.aspect.CommonJoinPointConfig.serviceLayerExecution()")
//    @Before("execution(* hu.tmx.aop.exampleOne.service.*.*(..))")
//    @Before("execution(* hu.tmx.aop.exampleOne.dao.*.*(..))")
//    @Before("execution(* hu.tmx.aop..*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info(" Intercepted Method Call - {}", joinPoint);
    }
}
