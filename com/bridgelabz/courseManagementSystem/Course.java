package com.bridgelabz.courseManagementSystem;

public class Course<T extends CourseType>{
    T course;

    Course(T course){
        this.course = course;
    }

    public void displayCourse(){
        System.out.println(
                "Course Type: " + course.getCourseType() + '\n' +
                "Course Name: " + course.getCourseName() + '\n'
        );
    }

}
