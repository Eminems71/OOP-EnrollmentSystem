package org.example.service;

import org.example.model.Courses;

public interface Coursereg {
    void saveCourse(Courses course);
    void displayAllCourse();
    void updateCourse(Courses courses);
    void removeCourse(Courses course);
}
