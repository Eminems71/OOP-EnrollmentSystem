package org.example.service;

import org.example.model.Database;
import org.example.model.Instructor;

public class InstructorServiceImpl implements IInstructorService {

    @Override
    public void addInstructor(Instructor instructor) {
        if (instructor != null) {
            Database.instructors.add(instructor);
            System.out.println("Instructor registered successfully!");
        }
    }

    @Override
    public void displayAllInstructors() {
        if (Database.instructors.isEmpty()) {
            System.out.println("No instructors found.");
            return;
        }
        for (Instructor i : Database.instructors) {
            System.out.println("ID: " + i.getPersonID() + " | Name: " + i.getPersonName());
        }
    }

    @Override
    public void updateInstructor(String instructorId, String newName, String newDept) {
        Instructor inst = getInstructorById(instructorId);
        if (inst != null) {
            inst.setPersonName(newName);
            inst.setDepartment(newDept);
            System.out.println("Updated successfully!");
        } else {
            System.out.println("Instructor not found.");
        }
    }

    @Override
    public void removeInstructor(String instructorId) {
        Database.instructors.removeIf(i -> i.getPersonID().equalsIgnoreCase(instructorId));
    }

    @Override
    public Instructor getInstructorById(String instructorId) {
        for (Instructor i : Database.instructors) {
            if (i.getPersonID().equalsIgnoreCase(instructorId)) {
                return i;
            }
        }
        return null;
    }
}