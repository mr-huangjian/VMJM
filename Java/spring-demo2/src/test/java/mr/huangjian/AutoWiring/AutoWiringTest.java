package mr.huangjian.AutoWiring;

import mr.huangjian.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringTest extends UnitTestBase {
    public AutoWiringTest() {
        super("bean-auto-wiring.xml");
    }

    @Test
    public void test() {
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("hello");
    }

}