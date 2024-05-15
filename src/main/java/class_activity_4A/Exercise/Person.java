package class_activity_4A.Exercise;

public abstract class Person {
    private String name ;
    private   int age;
    //CONSTRUCTOR
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //GETTERS
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public abstract void display();
}
