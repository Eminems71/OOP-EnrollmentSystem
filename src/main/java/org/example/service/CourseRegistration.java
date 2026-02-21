package org.example.service;
import org.example.model.Courses;
import java.util.ArrayList;


public class CourseRegistration {
    private ArrayList<Courses> courseList = new ArrayList();

    public void saveCourse(Courses course) {
        courseList.add(course);

    }

    public void displayAllCourse() {
        for (Courses c : courseList) {
            System.out.println(c.getCourseID());
            System.out.println(c.getCourseName());
            System.out.println(c.getCourseProgram());
        }
    }

    public void updateCourse(Courses course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseName().equals(course.getCourseName())) {
                courseList.set(i, course);
                break;
            }
        }
    }

    public void removeCourse(Courses course){
    for(int i = 0; i < courseList.size(); i++) {
        if (courseList.get(i).getCourseName().equals(course.getCourseName())) {
            courseList.remove(i);
            break;
        }

      }
    }
}




