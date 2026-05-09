package org.example.service;

import org.example.model.Instructor;
import java.util.List;

public interface IInstructorService {
    void addInstructor(Instructor instructor);
    void displayAllInstructors();
    void updateInstructor(String id, String name, String dept);
    void removeInstructor(String id);
    Instructor getInstructorById(String id);
}