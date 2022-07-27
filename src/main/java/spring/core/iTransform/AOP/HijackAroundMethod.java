package spring.core.iTransform.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Method name : " + invocation.getMethod().getName());
        System.out.println("Method arguments : " + invocation.getArguments());

        System.out.println("HijackAroundMethod : Before method hijacked!");

        try {
            Object result = invocation.proceed();
            System.out.println("HijackAroundMethod : After method hijacked!");

            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("HijackAroundMethod : Throw exception hijacked!");
            throw e;
        }
    }
}
