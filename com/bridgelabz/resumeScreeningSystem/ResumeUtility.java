package com.bridgelabz.resumeScreeningSystem;

import java.util.List;

public class ResumeUtility {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Processing resume for: " + role.getRoleName());
        }
    }
}
