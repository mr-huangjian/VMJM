package mr.huangjian;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleTest extends UnitTestBase {
    public BeanLifeCycleTest() {
        super("bean-life-cycle.xml");
    }

    @Test
    public void test() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");

    }

}