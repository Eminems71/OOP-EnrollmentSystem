package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import org.example.model.Database;

public class InstructorServiceImpl implements IInstructorService {

    @Override
    public void addInstructor(Instructor instructor) {
        Database.instructors.add(instructor);
        System.out.println("Instructor registered successfully!");
    }

    @Override
    public void assignInstructorToSection(Instructor instructor, Section section) {

        System.out.println("Assigning " + instructor.getPersonName() + " to section");
    }

    @Override
    public void getInstructorDetails(Instructor instructor) {
        System.out.println("ID: " + instructor.getEmployeeId());

        System.out.println("Name: " + instructor.getPersonName());
        System.out.println("Department: " + instructor.getDepartment());
    }
}