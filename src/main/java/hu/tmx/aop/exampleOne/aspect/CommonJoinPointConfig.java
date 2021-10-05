package hu.tmx.aop.exampleOne.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* hu.tmx.aop.exampleOne.service.*.*(..))")
    public void serviceLayerExecution(){}

    @Pointcut("execution(* hu.tmx.aop.exampleOne.dao.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("within(hu.tmx.aop.exampleOne.dao..*)")
    public void dataLayerExecutionWithin(){}

    @Pointcut("serviceLayerExecution() || dataLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(dao*)")
    public void beanStartingDao(){}

    @Pointcut("bean(*dao*)")
    public void beanContainsDao(){}

    @Pointcut("@annotation(hu.tmx.aop.exampleOne.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
