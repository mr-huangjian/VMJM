package bean.factory.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactoryTest {
    public static void main(String[] args) {
        String configLocation = "bean-factory-spring-config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        System.out.println(context.getBean("bean"));
    }
}
