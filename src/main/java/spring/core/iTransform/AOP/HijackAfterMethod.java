package spring.core.iTransform.AOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class HijackAfterMethod implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked");
    }
}
