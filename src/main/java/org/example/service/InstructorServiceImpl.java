package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;

public class InstructorServiceImpl implements IInstructorService {
    @Override
    public void addInstructor(Instructor instructor) {
    }

    @Override
    public void assignInstructorToSection(Instructor instructor, Section section) {
        if (instructor != null && section != null) {
            System.out.println("Instructor " + instructor.getLastName() + " assigned to " + section.getSectionCode());
        }
    }

    @Override
    public void getInstructorDetails(Instructor instructor) {
        if (instructor != null) {
            System.out.println("Instructor: " + instructor.getPersonName());
        }
    }
}