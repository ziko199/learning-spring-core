package spring.core.iTransform.AOP;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HijackBeforeMethod implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked");
    }
}
