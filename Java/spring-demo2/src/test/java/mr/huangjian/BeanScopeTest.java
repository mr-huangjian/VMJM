package mr.huangjian;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase {
    public BeanScopeTest() {
        super("bean-scope.xml");
    }

    @Test
    public void test1() {
        {
            BeanScope beanScope = super.getBean("beanScope");
            beanScope.say();
        }

        {
            BeanScope beanScope = super.getBean("beanScope");
            beanScope.say();
        }
    }

    @Test
    public void test2() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }
}