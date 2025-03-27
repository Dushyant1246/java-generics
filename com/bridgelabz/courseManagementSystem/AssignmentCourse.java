package com.bridgelabz.courseManagementSystem;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    String getCourseType() {
        return "Assignment";
    }
}
