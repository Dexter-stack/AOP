package org.core;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.core.ShoppingCart.checkout(..))")
    public void logger(JoinPoint joinPoint){
        //get data from a function
        System.out.println( joinPoint.getSignature());
       String data =  joinPoint.getArgs()[0].toString();
        System.out.println(data);

        System.out.println("Loggers");
    }

    @After("execution(* org.core.ShoppingCart.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }

    @Pointcut("execution(* org.core.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After returning : " + retVal );
    }


}
