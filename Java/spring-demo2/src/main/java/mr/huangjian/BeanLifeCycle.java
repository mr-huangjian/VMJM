package mr.huangjian;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("- [BeanLifeCycle destroy]");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("- [BeanLifeCycle afterPropertiesSet]");
    }


    public void start() {
        System.out.println("- [BeanLifeCycle start]");
    }

    public void stop() {
        System.out.println("- [BeanLifeCycle stop]");
    }


    public void defaultInit() {
        System.out.println("- [BeanLifeCycle defaultInit]");
    }

    public void defaultDestroy() {
        System.out.println("- [BeanLifeCycle defaultDestroy]");
    }
}
