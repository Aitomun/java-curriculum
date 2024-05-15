//package Demo_project;
//
//import Demo_project.enums.CourseOffer;
//import Demo_project.enums.Gender;
//import Demo_project.model.*;
//import Demo_project.service.impl.ApplicantServiceimpl;
//import Demo_project.service.impl.PrincipalServiceImpl;
//import Demo_project.service.impl.StudentServiceImpl;
//import Demo_project.service.impl.TeachableServiceImpl;
//
//public class SchoolSystem {
//    public static void main(String[] args) {
//         Teacher teacher1 = new Teacher(20, "David", Gender.TRANS_GENDER);
//         Teacher teacher2 = new Teacher(20, "IKISEH", Gender.TRANS_GENDER);
//
//        Course course1 = new Course(CourseOffer.JAVA);
//        Course course2 = new Course(CourseOffer.PYHTON);
//        Course course3 = new Course(CourseOffer.NODE);
//
//        Principal principal = new Principal(20, "Dexter", Gender.MALE);
//        PrincipalServiceImpl principalData = new PrincipalServiceImpl();
//        PrincipalServiceImpl expelStudent = new PrincipalServiceImpl();
//
//        Student student3 = new Student(23, "mary", Gender.FEMALE);
//
//        Applicant applicant1 = new Applicant(18, "sele", Gender.MALE);
//        Applicant applicant2 = new Applicant(15, "yomi", Gender.MALE);
//        ApplicantServiceimpl applicantData = new ApplicantServiceimpl();
//
//        TeachableServiceImpl teachableServiceImpl1 = new TeachableServiceImpl();
//        TeachableServiceImpl teachableServiceImpl2 = new TeachableServiceImpl();
//
//        System.out.println("Teacher data");
//        teachableServiceImpl1.teachCourse(teacher1, course1);
//        System.out.println("****************");
//
//        System.out.println("Teacher data");
//        teachableServiceImpl2.teachCourse(teacher2, course2);
//        System.out.println("***********");
//
//        StudentServiceImpl studentService = new StudentServiceImpl();
//
//        Student student1 = new Student(20, "dad", "max", Gender.MALE);
//        Student student2 = new Student(30, "max", Gender.FEMALE);
//
//        System.out.println("Student data");
//        studentService.studentTakeCourse(student1, course1);
//        System.out.println("**********");
//        System.out.println("Student data");
//        studentService.studentTakeCourse(student2, course3);
//        System.out.println("*********");
//
//        System.out.println("Principal data");
//        principalData.display(principal);
//        System.out.println("********");
//
//        System.out.println("Student Expelled Data");
//        expelStudent.expelStudent(student1, principal);
//        System.out.println("*************");
//
//        System.out.println("Applicant Data");
//        applicantData.display(applicant1);
//        applicantData.display(applicant2);
//        System.out.println("*************");
//
//        System.out.println("Successful Admission");
//        applicantData.admitStudent(applicant1);
//        System.out.println("*************");
//
//        System.out.println("Admission Denied");
//        applicantData.admitStudent(applicant2);
//
//    }
//}
