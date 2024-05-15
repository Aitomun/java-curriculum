package class_activity_4A.Exercise;

import Demo_project.enums.Gender;

public class Teacher extends Person{
    public Teacher (String name, int age ){
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println(getName()+" "+getAge());

    }
}
