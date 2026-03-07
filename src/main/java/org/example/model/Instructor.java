package org.example.model;

public class Instructor {

    String InstructorID;
    String InstructorName;
    String CourseName;

    public Instructor(String ID, String Name, String Course){
       this.InstructorID = ID;
       this.InstructorName = Name;
       this.CourseName = Course;

    }
    public void setInstructorID(String ID){
        this.InstructorID = InstructorID;

    }
    public String getInstructorID(){
        return InstructorID;

    }
    public void setInstructorName(String Name){
        this.InstructorName = InstructorName;
    }
    public String getInstructorName(){
        return InstructorName;

    }
    public void setCourseName(String Course){
        this.CourseName = CourseName;

    }
    public String getCourseName(){
        return CourseName;

    }


}
