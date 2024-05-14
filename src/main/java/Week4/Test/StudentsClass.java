package Week4.Test;

public class StudentsClass {
    private int admissionNo;
    private String firstName;
    private String dob;
    private String gender;
    private int age;
    private String lastName;

    public StudentsClass(int admissionNo, String firstName, String dob, String gender, int age, String lastName) {
        this.admissionNo = admissionNo;
        this.firstName = firstName;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
        this.lastName = lastName;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "StudentsClass{" +
                "admissionNo=" + admissionNo +
                ", firstName='" + firstName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
