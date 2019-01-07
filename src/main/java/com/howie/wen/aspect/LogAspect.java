package com.howie.wen.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author:HowieLee
 * @Date:1/5/2019
 * @Description:com.howie.wenda.aspect
 * @version:1.0
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Before("execution(* com.howie.wen.controller.indexController.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        StringBuilder sc = new StringBuilder();
        for(Object arg : joinPoint.getArgs()){
            sc.append("arg" + arg.toString() +"|");
        }
        logger.info("before method" + sc.toString());
    }

    @After("execution(* com.howie.wen.controller.indexController.*(..))")
    public void afterMethod(){
        logger.info("after method" + new Date());
    }
}
