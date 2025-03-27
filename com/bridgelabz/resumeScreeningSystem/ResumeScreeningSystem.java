package com.bridgelabz.resumeScreeningSystem;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer(), "Alice");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist(), "Bob");

        seResume.displayResume();
        dsResume.displayResume();

        List<JobRole> jobRoles = Arrays.asList(new SoftwareEngineer(), new ProductManager());
        ResumeUtility.processResumes(jobRoles);
    }
}
/*
Candidate: Alice | Applying for: Software Engineer
Candidate: Bob | Applying for: Data Scientist
Processing resume for: Software Engineer
Processing resume for: Product Manager
 */