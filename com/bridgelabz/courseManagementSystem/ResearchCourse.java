package com.bridgelabz.courseManagementSystem;

public class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    String getCourseType() {
        return "Research";
    }
}
