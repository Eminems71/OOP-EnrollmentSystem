package org.example;

public class Courses {
    private int courseID;
    private String courseName;
    private String courseProgram;

    public Courses(){

    }
    public Courses(int courseID, String courseName, String courseProgram){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
    }
    public int getCourseID(){
        return courseID;

    }
    public void setCourseID(int ID){
        this.courseID = courseID;

    }
    public String getCourseName(){
        return courseName;

    }
    public void setCourseName(String courseName){
        this.courseName = courseName;

    }
    public String getcourseProgram(){
        return courseProgram;

    }
    public void setCourseProgram(String courseProgram){
        this.courseProgram = courseProgram;
    }
}
