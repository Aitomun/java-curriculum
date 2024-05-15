package Week4.DemoProject2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Step1; create an array of student object
        Students[] students = {
                new Students(4,"daro","max","12/3/2004","Male",20),
                new Students(3,"mary","paul","25/3/1960","Female",24),
                new Students(2,"scion","jeff","20/4/2001","Male",26),
                new Students(1,"kise","roy","12/3/2009","Male",27),
                new Students(0,"john","doe","12/3/2004","Male",19),
        };
        //Step2 write student object inyo a csv file
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try {
            FileWriter fw = new  FileWriter(desktopPath + "/Students1.csv");

            fw.write("Admission, FirstName, LastName, DOB, Gender\n");
            for (Students student : students){
                fw.write(student.getAdmissionNo() + ",");
                fw.write(student.getFirstName() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getDob() + ",");
                fw.write(student.getAge() + ",");
                fw.write(student.getGender() + "\n");
            }
            fw.close();
            System.out.println("Sucessfully  written into csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
