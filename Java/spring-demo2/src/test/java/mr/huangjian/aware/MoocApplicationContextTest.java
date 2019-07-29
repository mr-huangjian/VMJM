package mr.huangjian.aware;

import mr.huangjian.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class MoocApplicationContextTest extends UnitTestBase {
    public MoocApplicationContextTest() {
        super("bean-aware.xml");
    }

    @Test
    public void test() {
        System.out.println("test: " + super.getBean("moocApplicationContext"));
    }

    @Test
    public void test2() {
        System.out.println("test2: " + super.getBean("moocBeanName"));
    }

}