package spring.core.iTransform.Assignments.Assignment_1_WithConstructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.core.iTransform.Assignments.Assignment_1_WithConstructor.Customer;

import static org.junit.jupiter.api.Assertions.*;

class Assignment_1_Test_WithConstructor {

    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("/Assignments/assignment_1_WithConstructor.xml");;

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