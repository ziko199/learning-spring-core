package spring.core.iTransform.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Customer.xml");

        CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceProxy");

        System.out.println("**************************");
        customerService.printName();
        System.out.println("**************************");
        customerService.printURL();
        System.out.println("**************************");
        try {
            customerService.printThrowException();
        } catch (Exception e) {

        }
    }
}