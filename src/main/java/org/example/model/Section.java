package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionCode;
    private int maxCapacity;
    private Instructor instructor;
    private List<Student> enrolledStudents;

    public Section(String sectionCode, int maxCapacity) {
        this.sectionCode = sectionCode;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getSectionCode() { return sectionCode; }
    public String getSectionName() { return sectionCode; }
    public int getMaxCapacity() { return maxCapacity; }
    public Instructor getInstructor() { return instructor; }
    public List<Student> getEnrolledStudents() { return enrolledStudents; }

    public void setSectionCode(String sectionCode) { this.sectionCode = sectionCode; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
}