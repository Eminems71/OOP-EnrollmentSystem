package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String studentId;
    private String studentProgram;
    private List<Courses> enrolledCourses;

    public Student(String personName, String personId, String studentId, String studentProgram) {
        super(personName, personId);
        this.studentId = studentId;
        this.studentProgram = studentProgram;
        this.enrolledCourses = new ArrayList<>();
    }


    @Override
    public void mainTask() {
        System.out.println("Student is attending classes.");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }

    public List<Courses> getEnrolledCourses() {
        return enrolledCourses;
    }
}