package org.example.service;

import org.example.model.Student;
import org.example.model.Section;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentServiceImpl implements IEnrollmentService {
    private List<Section> sections = new ArrayList<>();

    @Override
    public void addSection(Section section) {
        sections.add(section);
    }

    @Override
    public void enrollStudentInSection(Student student, Section section) {
        if (section.getEnrolledStudents(1).size() < section.getMaxCapacity()) {
            section.getEnrolledStudents(1).add(student);
            student.getEnrolledCourses().add(section.getCourse());
            System.out.println("Success: " + student.getPersonName() + " enrolled in " + section.getSectionCode());
        } else {
            System.out.println("ERROR: Section " + section.getSectionCode() + " is FULL!");
        }
    }

    @Override
    public void viewDepartmentHierarchy() {
        System.out.println("\n--- Institutional Hierarchy: CICS ---");
        for (Section sec : sections) {
            sec.displaySectionDetails();
            System.out.println("---------------------------------------------");
        }
    }

    @Override
    public Section getSectionByCode(String code) {
        for (Section sec : sections) {
            if (sec.getSectionCode().equalsIgnoreCase(code)) {
                return sec;
            }
        }
        return null;
    }

    public List<Section> getSections() {
        return sections;
    }
}