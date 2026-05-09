package org.example.model;

public class Courses {
    private String courseID;
    private String courseName;
    private String courseProgram;
    private int units;
    private int maxCapacity = 30;
    private int enrolledCount = 0;

    public Courses() {}

    public Courses(String courseID, String courseName, String courseProgram, int units) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
        this.units = units;
    }

    public String getCourseID() { return courseID; }
    public void setCourseID(String courseID) { this.courseID = courseID; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getCourseProgram() { return courseProgram; }
    public void setCourseProgram(String courseProgram) { this.courseProgram = courseProgram; }

    public int getUnits() { return units; }
    public void setUnits(int units) { this.units = units; }

    public int getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }

    public int getEnrolledCount() { return enrolledCount; }
    public void setEnrolledCount(int enrolledCount) { this.enrolledCount = enrolledCount; }

    public void display() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Program: " + courseProgram);
        System.out.println("Units: " + units);
        System.out.println("Slots: " + enrolledCount + "/" + maxCapacity + "\n");
    }
}