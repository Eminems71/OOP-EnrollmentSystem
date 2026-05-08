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
            if (courses.get(i).getCourseID() == updatedCourse.getCourseID()) {
                courses.set(i, updatedCourse);
                return;
            }
        }
    }

    @Override
    public void removeCourse(int courseID) {
        courses.removeIf(course -> course.getCourseID() == courseID);
    }

    @Override
    public List<Courses> getAllCourses() {
        return courses;
    }

    @Override
    public Courses getCourseById(int courseID) {
        for (Courses course : courses) {
            if (course.getCourseID() == courseID) {
                return course;
            }
        }
        return null;
    }
}