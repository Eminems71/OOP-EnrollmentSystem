package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Student s = new Student();
        s.setstudentID(2024374351);
        s.setstudentName("EM");
        s.setstudentProgram("Information Technology");



        Courses p = new Courses();
        p.setCourseID(15151515);
        p.setCourseName("IT");
        p.setCourseProgram("Information Technology");

        s.display();
        p.display();


    }
}
