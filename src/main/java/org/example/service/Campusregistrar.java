package org.example.service;

import org.example.model.Courses;
import org.example.model.Student;

public class Campusregistrar {
    private Studentreg studentRegistration;
    private Coursereg courseRegistration;

    public Campusregistrar(Studentreg studentRegistration, Coursereg courseRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
    }

    public String saveCourse(Courses course) {
        courseRegistration.saveCourse(course);
        return "Success";
    }

    public String saveStudent(Student student) {
        studentRegistration.saveStudent(student);
        return "Success";
    }
}