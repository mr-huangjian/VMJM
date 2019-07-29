package bean.factory.student;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xmlbeans.XmlOptionsFactoryBean;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void test1() {
        StudentDao dao = new StudentDaoImpl();

        // StudentService service = new StudentServiceImpl();
        StudentServiceImpl service = new StudentServiceImpl();
        service.setDao(dao);

        service.sleep();
    }

    @Test
    public void test2() {
        String configLocation = "student-spring-config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        StudentService service = (StudentService)context.getBean("studentService");
        service.sleep();
    }

    @Test
    @SuppressWarnings("deprecation") // 使用过期API
    public void test3() {
        // 实现按需加载，不是把核心文件中配置的所有bean都实例化
        String configLocation = "student-spring-config.xml";
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(configLocation));
        StudentService service = (StudentService)factory.getBean("studentService");
        service.sleep();
    }

}