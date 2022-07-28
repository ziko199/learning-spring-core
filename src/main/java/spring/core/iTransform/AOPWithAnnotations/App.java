package spring.core.iTransform.AOPWithAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP/aopAnnotation.xml");

        Operation operation  = (Operation) applicationContext.getBean("operationBean");

        System.out.println("************************** calling msg...");
        operation.msg();
        System.out.println("************************** calling m....");
        operation.m();
        System.out.println("************************** calling k...");
        operation.k();
    }

}
