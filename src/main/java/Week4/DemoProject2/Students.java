package Week4.DemoProject2;

public class Students {
    private  int admissionNo;
    private  String firstName;
    private  String lastName;
    private  String dob;
    private  String gender;
    private int age;

    @Override
    public String toString() {
        return "StudentsClass{" +
                "admissionId='" + admissionNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public Students(int admissionNo, String firstName, String lastName, String dob, String gender, int age) {
        this.admissionNo = admissionNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
    }
}
