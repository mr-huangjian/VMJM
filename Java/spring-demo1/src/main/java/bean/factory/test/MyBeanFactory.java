package bean.factory.test;

public class MyBeanFactory {
    public MyBeanFactory() {
        System.out.println("bean正在实例化");
    }

    public Bean createBean() {
        return new Bean();
    }
}
