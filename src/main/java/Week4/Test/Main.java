package Week4.Test;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        ArrayList<StudentsClass> students = new ArrayList();
        StudentsClass[] students = {new StudentsClass(1, "david", "25/1990", "Male", 30, "Aitomun"),
         new StudentsClass(2, "rose", "20/1996", "Female", 20, "lade"),
         new StudentsClass(3, "Jane", "20/2009", "Female", 20, "Frances"),
         new StudentsClass(4, "Michael", "15/2000", "Male", 30, "Faraday"),
         new StudentsClass(5, "Royal", "12/1995", "Female", 14, "Saint"),
        };

                String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileWriter fw = new FileWriter(desktopPath + "StudentFIleReading.csv");
        fw.write("AdmissionNo , FirstName , LastName , DOB , Gender , Age\n" );
          for(StudentsClass student : students){
              fw.write(student.getAdmissionNo() +" , ");
              fw.write(student.getFirstName() +" , ");
              fw.write(student.getLastName() +" , ");
              fw.write(student.getDob() +" , ");
              fw.write(student.getGender() +" , ");
              fw.write(student.getAge() +" \n ");
          }
          fw.close();
            System.out.println("student data has been written into csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

