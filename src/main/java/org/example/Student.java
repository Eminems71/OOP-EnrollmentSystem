package org.example;

public class Student {
    private int  studentID;
    private String studentName;
    private String studentProgram;

    public Student(){

    }
    public Student(int studentID, String studentName, String studentProgram){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentProgram = studentProgram;
    }
    public int getstudentID(){
        return studentID;

    }
    public void setstudentID(int ID){
        this.studentID = studentID;

     }

     public String getstudentName(){
     return studentName;

     }
     public void setstudentName(String Name){
        this.studentName = studentName;

     }
     public String getstudentProgram(){
        return studentProgram;

     }
     public void setstudentProgram(String Program){
        this.studentProgram = studentProgram;
     }

}
