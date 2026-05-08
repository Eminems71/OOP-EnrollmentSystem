package org.example.service;

import org.example.model.Database;
import org.example.model.Instructor;

public class InstructorServiceImpl implements IInstructorService {

    @Override
    public void addInstructor(Instructor instructor) {
        Database.instructors.add(instructor);
        System.out.println("Instructor registered successfully!");
    }

    @Override
    public void displayAllInstructors() {
        if (Database.instructors.isEmpty()) {
            System.out.println("No instructors found in the database.");
            return;
        }
        System.out.println("\n--- Instructor List ---");
        for (Instructor i : Database.instructors) {
            System.out.println("ID: " + i.getPersonID() + " | Name: " + i.getPersonName() + " | Dept: " + i.getDepartment());
        }
    }

    @Override
    public void updateInstructor(String instructorId, String newName, String newDept) {
        for (Instructor i : Database.instructors) {
            if (i.getPersonID().equals(instructorId)) {
                i.setPersonName(newName);
                i.setDepartment(newDept);
                System.out.println("Instructor updated successfully!");
                return;
            }
        }
        System.out.println("Instructor with ID " + instructorId + " not found.");
    }

    @Override
    public void removeInstructor(String instructorId) {
        boolean removed = Database.instructors.removeIf(i -> i.getPersonID().equals(instructorId));
        if (removed) {
            System.out.println("Instructor removed successfully!");
        } else {
            System.out.println("Instructor with ID " + instructorId + " not found.");
        }
    }
}