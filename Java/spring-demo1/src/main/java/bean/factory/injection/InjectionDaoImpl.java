package bean.factory.injection;

public class InjectionDaoImpl implements InjectionDao {

    @Override
    public void save(String arg) {
        System.out.println("[InjectionDaoImpl - save] arg: " + arg);
    }
}
