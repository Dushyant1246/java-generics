package com.bridgelabz.resumeScreeningSystem;

public class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;

    public Resume(T jobRole, String candidateName) {
        this.jobRole = jobRole;
        this.candidateName = candidateName;
    }

    public void displayResume() {
        System.out.println("Candidate: " + candidateName + " | Applying for: " + jobRole.getRoleName());
    }
}
