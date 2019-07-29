package mr.huangjian.AutoWiring;

public class AutoWiringService {
    // 自动装配（隐式引用），注入依赖
    // default-autowire="byName"
    // default-autowire="byType"
    private AutoWiringDAO autoWiringDAO;

    // default-autowire="constructor"
    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        System.out.println("- [AutoWiringService AutoWiringService:] ");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("- [AutoWiringService setAutoWiringDAO:] ");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }


}
