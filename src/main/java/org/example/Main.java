package org.example;

public class Main {
    public static void main(String[] args){
        Student s = new Student();
        Student s1 = new Student();
        Courses p = new Courses();

        s.setStudentID(2024374351);
        s.setStudentName("EM");
        s.setStudentProgram("Information Technology");

        s1.setStudentID(14554587);
        s1.setStudentName("Mawel");
        s1.setStudentProgram("IT");

        p.setCourseID(15151515);
        p.setCourseName("IT");
        p.setCourseProgram("Information Technology");

       s.display();
       s1.display();
       p.display();


    }
}
