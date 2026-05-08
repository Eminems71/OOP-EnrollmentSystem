package org.example.service;

import org.example.model.Student;

public interface IStudentService {
    void addStudent(Student student);
    void displayAllStudents();
    void updateStudent(String studentId, String newName, String newProgram);
    void removeStudent(String studentId);
    Student getStudentById(String studentId);
}