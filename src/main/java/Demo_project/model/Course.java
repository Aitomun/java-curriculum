package Demo_project.model;

import Demo_project.enums.CourseOffer;

public class Course {
    private CourseOffer courseOffer;

    public Course(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }
}
