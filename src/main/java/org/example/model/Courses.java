package org.example.model;

public class Courses {
    private int courseID;
    private String courseName;
    private String courseProgram;
    private int units;

    public Courses() {}

    public Courses(int courseID, String courseName, String courseProgram, int units) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
        this.units = units;
    }

    public int getCourseID() { return courseID; }
    public void setCourseID(int courseID) { this.courseID = courseID; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getCourseProgram() { return courseProgram; }
    public void setCourseProgram(String courseProgram) { this.courseProgram = courseProgram; }

    public int getUnits() { return units; }
    public void setUnits(int units) { this.units = units; }

    public void display() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Program: " + courseProgram);
        System.out.println("Units: " + units + "\n");
    }
}