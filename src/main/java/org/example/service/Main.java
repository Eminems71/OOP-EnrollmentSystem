package org.example.service;

import org.example.model.Courses;
import org.example.model.Student;

public class Main {
    public static void main(String[] args){
        Student s = new Student("caryl", "1001", "IT");
        Student s1 = new Student("bob", "90", "it");
        Courses p = new Courses();

        s.setPersonID("024374351");
        s.setPersonName("EM");
        s.setStudentProgram("Information Technology");

        s1.setPersonID("455458");
        s1.setPersonName("Mawel");
        s1.setStudentProgram("IT");

        p.setCourseID(15151515);
        p.setCourseName("IT");
        p.setCourseProgram("Information Technology");

       s.display();
       s1.display();
       p.display();


    }
}
