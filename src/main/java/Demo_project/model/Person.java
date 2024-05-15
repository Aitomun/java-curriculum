package Demo_project.model;


import Demo_project.enums.Gender;

public abstract class  Person {
    private int age;
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person(int age, String firstName, String lastName, Gender gender) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}


