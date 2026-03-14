package org.example.model;

public class Student extends Person{

    private String studentProgram;


    public Student(String personName, String personID, String studentProgram){
        super(personName, personID);
        this.studentProgram = studentProgram;
    }

     public String getStudentProgram(){
        return studentProgram;

     }
     public void setStudentProgram(String studentProgram){
        this.studentProgram = studentProgram;
     }

     public void display(){

         System.out.println("Student Program: " + getStudentProgram() + "\n");
     }

    @Override
    public void mainTask() {
        System.out.println("Student Enrolled");
    }
}
