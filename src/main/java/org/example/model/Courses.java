package org.example.model;

public class Courses {
    private int courseID;
    private String courseName;
    private String courseProgram;


    public Courses() {

    }

    public Courses(int courseID, String courseName, String courseProgram) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
    }

    public int getCourseID() {
        return courseID;

    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;

    }

    public String getCourseName() {
        return courseName;

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseProgram() {
        return courseProgram;

    }

    public void setCourseProgram(String courseProgram) {
        this.courseProgram = courseProgram;
    }

    public void display() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Course Program: " + getCourseProgram() + "\n");
    }
}
