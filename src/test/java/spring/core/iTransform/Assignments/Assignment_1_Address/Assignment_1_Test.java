package spring.core.iTransform.Assignments.Assignment_1_Address;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class Assignment_1_Test {

    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("/Assignments/assignment_1_Address.xml");;

    @Test
    public void should_ReturnTrue_When_BeanExists() {
        // given
        // when
        Customer customer = (Customer) applicationContext.getBean("customer");
        System.out.println(customer);
        // then
        assertNotNull(customer);
    }
}