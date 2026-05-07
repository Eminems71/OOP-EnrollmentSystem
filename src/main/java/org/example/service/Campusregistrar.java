package org.example.service;

import org.example.model.Courses;
import org.example.model.Student;

public class Campusregistrar {
    private Studentreg studentRegistration;
    private Coursereg courseRegistration;

    public Campusregistrar(Studentreg StudentRegistration, Coursereg CourseRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;

    }
    public Campusregistrar(Studentreg StudentRegistration, Coursereg CourseRegistration){


    public String saveCourse(Courses course) {
        courseRegistration.saveCourse(course);
        return "Success";

    }
    public String saveCourse(Course course){
        CourseRegistration.saveCourse(course){
            return;"Success";

    }
    public String saveStudent(Student student){

            }

}
