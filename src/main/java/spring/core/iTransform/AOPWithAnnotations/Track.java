package spring.core.iTransform.AOPWithAnnotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {

    @Pointcut("execution(* Operation.m*(..))")
    public void k(){} // pointcut name

    @Before("k()") // applying pointcut on before advice
    public void myAdvice(JoinPoint joinPoint) {
        System.out.println("additional concern");
        System.out.println("joinPoint : " + joinPoint);
        System.out.println("joinPoint.getKind() : " + joinPoint.getKind());
        System.out.println("joinPoint.getArgs() : " + joinPoint.getArgs());
        System.out.println("joinPoint.getSignature() : " + joinPoint.getSignature());
        System.out.println("joinPoint.getSourceLocation() : " + joinPoint.getSourceLocation());
        System.out.println("joinPoint.getStaticPart() : " + joinPoint.getStaticPart());
        System.out.println("joinPoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("joinPoint.getThis() : " + joinPoint.getThis());
    }
}
