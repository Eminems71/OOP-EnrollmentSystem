package org.example.service;

import org.example.model.Student;

public class StudentServiceImpl implements IStudentService {

    @Override
    public void addStudent(Student student) {
        Database.students.add(student);
        System.out.println("Student registered: " + student.getPersonName());
    }

    @Override
    public void displayAllStudents() {
        if (Database.students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Student s : Database.students) {
                System.out.println("ID: " + s.getStudentId() +
                        " | Name: " + s.getPersonName() +
                        " | Program: " + s.getStudentProgram());
            }
        }
    }

    @Override public void updateStudent(Student student) { }
    @Override public void removeStudent(Student student) { }
}