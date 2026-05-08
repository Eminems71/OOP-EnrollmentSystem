package org.example.service;

import org.example.model.Instructor;

public interface IInstructorService {
    void addInstructor(Instructor instructor);
    void displayAllInstructors();
    void updateInstructor(String instructorId, String newName, String newDept);
    void removeInstructor(String instructorId);
}