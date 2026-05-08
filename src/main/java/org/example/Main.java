package org.example;

import org.example.model.Courses;
import org.example.model.Student;

public class Main {
    public static void main(String[] args){
        Student s = new Student("EM", "024374351", "1001", "Information Technology");
        Student s1 = new Student("Mawel", "455458", "90", "IT");

        Courses p = new Courses();

        p.setCourseID(15151515);
        p.setCourseName("IT");
        p.setCourseProgram("Information Technology");

        s.mainTask();
        s1.mainTask();

        System.out.println("Course: " + p.getCourseName());
    }
}