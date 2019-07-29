package bean.factory.injection;

public class InjectionServiceImpl implements InjectionService {
    private InjectionDao injectionDao;

    public InjectionServiceImpl() {

    }

    // 构造器注入依赖
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String arg) {
        System.out.println("[InjectionServiceImpl - save] receive arg: " + arg);
        arg = arg + ":" + this.hashCode();
        injectionDao.save(arg);
    }

    // 属性赋值注入依赖
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }
}
