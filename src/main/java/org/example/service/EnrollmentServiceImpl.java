package org.example.service;

import org.example.model.Student;
import org.example.model.Section;

public class EnrollmentServiceImpl implements IEnrollmentService {
    @Override
    public void enrollStudentInSection(Student student, Section section) {
        if (section.getEnrolledStudents().size() < section.getMaxCapacity()) {
            section.getEnrolledStudents().add(student);
            System.out.println(student.getPersonName() + " enrolled in " + section.getSectionCode());
        }
    }

    @Override
    public void viewDepartmentHierarchy() {
    }
}