package bean.factory.student;

public class StudentDaoImpl implements StudentDao {
    public StudentDaoImpl() {
        System.out.println("StudentDaoImpl类的无参构造");
    }

    @Override
    public void sleep() {
        System.out.println("学生正在睡觉");
    }

    @Override
    public String eat() {
        System.out.println("学生正在吃东西");
        return "苹果";
    }
}
