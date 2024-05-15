package class_activity_1B;

public class SuperClass {
    private  String name;

    public SuperClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name; " + getName());
    }
}
