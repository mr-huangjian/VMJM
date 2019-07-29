package mr.huangjian.resource;

import mr.huangjian.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class MoocResourceTest extends UnitTestBase {
    public MoocResourceTest() {
        super("bean-resource.xml");
    }

    @Test
    public void test() {
        MoocResource moocResource = super.getBean("moocResource");
        moocResource.resource();
    }
}