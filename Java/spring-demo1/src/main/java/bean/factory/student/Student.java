package bean.factory.student;

public class Student {
    private Integer id;
    private String name;

    public Student() {
        System.out.println("Student类的无参构造");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
