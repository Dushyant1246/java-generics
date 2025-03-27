package com.bridgelabz.courseManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseManagementSystem {
    public static void main(String[] args) {

        ExamCourse examCourse = new ExamCourse("Mathematics");
        AssignmentCourse assignmentCourse = new AssignmentCourse("Computer Science");
        ResearchCourse researchCourse = new ResearchCourse("Physics Research");

        Course<ExamCourse> math = new Course<>(examCourse);
        Course<AssignmentCourse> cs = new Course<>(assignmentCourse);
        Course<ResearchCourse> physics = new Course<>(researchCourse);

        // Using generic CourseManager
        List<Course> courseManager = new ArrayList<>();
        courseManager.add(math);
        courseManager.add(cs);
        courseManager.add(physics);

        System.out.println("Displaying Courses from CourseManager:");
        for (Course course: courseManager){
            course.displayCourse();
        }

        // Using wildcard method to handle different course types
        System.out.println("\nUsing Wildcards to Print Course Details:");
        CourseUtility.printCourseDetails(Arrays.asList(examCourse, assignmentCourse, researchCourse));
    }
}
/*
Displaying Courses from CourseManager:
Course Type: Exam
Course Name: Mathematics

Course Type: Assignment
Course Name: Computer Science

Course Type: Research
Course Name: Physics Research


Using Wildcards to Print Course Details:
Course: Mathematics
Course: Computer Science
Course: Physics Research
 */