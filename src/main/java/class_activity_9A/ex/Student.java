package class_activity_9A.ex;

public class Student {
    int matricNo;

    public Student(int matricNo, String studentNmae) {
        this.matricNo = matricNo;
        this.studentNmae = studentNmae;
    }

    String studentNmae;
     static void changeUniversity(){
        universityName ="covenant";
    }



  static   String universityName ="Uniben";
  void display(){
      System.out.println( studentNmae + " " +matricNo +" " + universityName);
  }
}
