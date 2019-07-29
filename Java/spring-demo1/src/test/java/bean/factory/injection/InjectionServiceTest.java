package bean.factory.injection;

import bean.factory.student.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionServiceTest extends UnitTestBase {
    public InjectionServiceTest() {
        super("injection-spring-config.xml");
    }

    @Test
    public void test() {
        {
            InjectionService injectionService = super.getBean("injectionService");
            injectionService.save("abc");
        }

        {
            InjectionService injectionService = super.getBean("injectionService2");
            injectionService.save("abc");
        }
    }
}