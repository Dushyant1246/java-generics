package com.bridgelabz.courseManagementSystem;

public class ExamCourse extends CourseType{
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    String getCourseType() {
        return "Exam";
    }
}
