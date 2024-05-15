package Demo_project.model;

import Demo_project.enums.Gender;

public class Student extends Person{
    private  int StudentId;

    public Student(int age, String firstName, String lastName, Gender gender, int studentId, int gradeLevel) {
        super(age, firstName, lastName, gender);
        StudentId = studentId;
        this.gradeLevel = gradeLevel;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    private  int gradeLevel;
}
