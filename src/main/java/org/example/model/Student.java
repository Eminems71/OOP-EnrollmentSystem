package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String studentProgram;
    private List<Courses> enrolledCourses;
    private double balance = 0.0;

    public Student(String personName, String personId, String password, String studentProgram) {
        super(personName, personId);
        this.studentProgram = studentProgram;
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void mainTask() {
        System.out.println("Student " + getPersonName() + " is attending classes.");
    }

    public String getStudentId() {
        return getPersonID();
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}