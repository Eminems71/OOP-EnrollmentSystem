package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionCode;
    private int maxCapacity;
    private Instructor instructor;
    private List<Student> enrolledStudents;
    private Courses course;

    public Section(String sectionCode, int maxCapacity, Courses course) {
        this.sectionCode = sectionCode;
        this.maxCapacity = maxCapacity;
        this.course = course;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) { this.sectionCode = sectionCode; }

    public int getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public List<Student> getEnrolledStudents() { return enrolledStudents; }

    public Courses getCourse() { return course; }
    public void setCourse(Courses course) { this.course = course; }

    public void displaySectionDetails() {
        System.out.println("Section Code: " + sectionCode);
        System.out.println("Course: " + (course != null ? course.getCourseName() : "No Course Assigned"));
        System.out.println("Instructor: " + (instructor != null ? instructor.getPersonName() : "No Instructor Assigned"));
        System.out.println("Capacity: " + enrolledStudents.size() + "/" + maxCapacity);
        System.out.println("Enrolled Students:");
        if (enrolledStudents.isEmpty()) {
            System.out.println("- None");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println("- " + s.getPersonName() + " (" + s.getStudentId() + ")");
            }
        }
    }
}