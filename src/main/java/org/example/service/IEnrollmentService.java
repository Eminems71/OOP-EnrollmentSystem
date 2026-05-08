package org.example.service;

import org.example.model.Student;
import org.example.model.Section;

public interface IEnrollmentService {
    void enrollStudentInSection(Student student, Section section);
    void viewDepartmentHierarchy();
}