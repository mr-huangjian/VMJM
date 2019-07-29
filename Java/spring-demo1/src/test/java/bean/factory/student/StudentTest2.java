package bean.factory.student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class StudentTest2 extends UnitTestBase {
    public StudentTest2() {
        // 直接传入 student-spring-config.xml 也行
        super("classpath*:student-spring-config.xml");
    }

    @Test
    public void test() {
        StudentService service = super.getBean("studentService");
        service.sleep();
    }
}