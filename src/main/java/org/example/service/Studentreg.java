package org.example.service;

import org.example.model.Student;

public interface Studentreg {
    void saveStudent(Student student);
    void displayAllStudent();
    void updateStudent(Student student);
    void removeStudent(Student student);
    
}
