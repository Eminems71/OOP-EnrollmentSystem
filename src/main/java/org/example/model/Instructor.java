package org.example.model;

public class Instructor extends Person {

    String CourseName;

    public Instructor(String personName, String personID, String Course){
       super(personName, personID);
       this.CourseName = Course;

    }



    public void setCourseName(String Course){
        this.CourseName = CourseName;

    }
    public String getCourseName(){
        return CourseName;

    }


    @Override
    public void mainTask() {

    }
}
