package com.bridgelabz.courseManagementSystem;

import java.util.List;

class CourseUtility {
    public static void printCourseDetails(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }
}
