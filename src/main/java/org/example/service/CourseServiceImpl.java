package org.example.service;

import org.example.model.Courses;
import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements ICourseService {
    private List<Courses> courses = new ArrayList<>();

    @Override
    public void addCourse(Courses course) {
        courses.add(course);
    }

    @Override
    public void updateCourse(Courses course) {
    }

    @Override
    public void removeCourse(Courses course) {
        courses.remove(course);
    }

    @Override
    public List<Courses> getAllCourses() {
        return courses;
    }
}