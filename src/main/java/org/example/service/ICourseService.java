package org.example.service;

import org.example.model.Courses;
import java.util.List;

public interface ICourseService {
    void addCourse(Courses course);
    void updateCourse(Courses course);
    void removeCourse(Courses course);
    List<Courses> getAllCourses();
}