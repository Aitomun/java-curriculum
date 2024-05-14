package Demo_project.service.impl;

import Demo_project.enums.CourseOffer;
import Demo_project.enums.Gender;
import Demo_project.model.Course;
import Demo_project.model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeachableServiceImplTest {

    @Test
    void ItShouldBeAbleToTeachCourse() {
        //Arrange
        // Create a mock Teacher object
        Teacher teacherInput = new Teacher(35, "John Doe", Gender.MALE);
        //create a mock course object
        Course course = new Course(CourseOffer.JAVA);

        //Create an instance of TeachableServiceImpl
        TeachableServiceImpl teachableService = new TeachableServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        //Act
        //call the method being tested
        teachableService.teachCourse(teacherInput, course);

        //Assert
        //Retrieve the output from the console
        String expected = "FullName : John Doe\nGender : MALE\nAge :35\nCourse taught : JAVA\n";

        assertEquals(expected, actualContent.toString());


    }

    @Test
    void itShouldBeAbleToTakeCourse() {
    }
}