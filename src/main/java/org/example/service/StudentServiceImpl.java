package org.example.service;

import org.example.model.Database;
import org.example.model.Student;

public class StudentServiceImpl implements IStudentService {

    @Override
    public void addStudent(Student student) {
        Database.students.add(student);
        System.out.println("Student registered successfully!");
    }

    @Override
    public void displayAllStudents() {
        if (Database.students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : Database.students) {
            System.out.println("ID: " + s.getPersonID() + " | Name: " + s.getPersonName() + " | Program: " + s.getStudentProgram());
        }
    }

    @Override
    public void updateStudent(String studentId, String newName, String newProgram) {
        for (Student s : Database.students) {
            if (s.getPersonID().equals(studentId)) {
                s.setPersonName(newName);
                s.setStudentProgram(newProgram);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    @Override
    public void removeStudent(String studentId) {
        boolean removed = Database.students.removeIf(s -> s.getPersonID().equals(studentId));
        if (removed) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    @Override
    public Student getStudentById(String studentId) {
        for (Student s : Database.students) {
            if (s.getPersonID().equals(studentId)) {
                return s;
            }
        }
        return null;
    }
}