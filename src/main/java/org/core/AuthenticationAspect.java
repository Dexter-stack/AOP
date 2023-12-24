package org.core;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class AuthenticationAspect {
    @Pointcut("within(org.core..*)")
    public  void authenticatingPointCut(){

    }

    @Pointcut("within(org.core..*)")
    public void authorizationPointCut(){

    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }
}
