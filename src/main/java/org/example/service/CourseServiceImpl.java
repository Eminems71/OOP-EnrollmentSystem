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
    public void updateCourse(Courses updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseID().equals(updatedCourse.getCourseID())) {
                courses.set(i, updatedCourse);
                return;
            }
        }
    }

    @Override
    public void removeCourse(String courseID) {
        courses.removeIf(course -> course.getCourseID().equals(courseID));
    }

    @Override
    public List<Courses> getAllCourses() {
        return courses;
    }

    @Override
    public Courses getCourseById(String courseID) {
        for (Courses course : courses) {
            if (course.getCourseID().equalsIgnoreCase(courseID)) {
                return course;
            }
        }
        return null;
    }
}