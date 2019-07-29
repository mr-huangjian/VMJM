package bean.factory.student;

public class StudentServiceImpl implements StudentService {
    public StudentServiceImpl() {
        System.out.println("StudentServiceImpl类的无参构造");
    }

    StudentDao dao;

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void sleep() {
        if (dao == null) {
            System.out.println("dao未实例化");
        }

        System.out.println("开始记录日志" + "[sleep]");
        dao.sleep();
        System.out.println("结束记录日志" + "[sleep]");
    }

    @Override
    public String eat() {
        System.out.println("开始记录日志" + "[eat]");
        String result = dao.eat();
        System.out.println("结束记录日志" + "[eat]");
        return result;
    }
}
