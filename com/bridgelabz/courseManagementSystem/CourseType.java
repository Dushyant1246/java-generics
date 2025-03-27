package com.bridgelabz.courseManagementSystem;

abstract public class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    abstract String getCourseType();
}
