package org.example;

import org.example.service.*;
import org.example.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IStudentService studentService = new StudentServiceImpl();
        IInstructorService instructorService = new InstructorServiceImpl();
        ICourseService courseService = new CourseServiceImpl();
        boolean running = true;

        while (running) {
            System.out.println("\n=============================================");
            System.out.println("==============ENROLLMENT SYSTEM==============");
            System.out.println("=============================================");
            System.out.println("1. Student Management");
            System.out.println("2. Instructor Management");
            System.out.println("3. Course Management");
            System.out.println("0. Exit Program");
            System.out.print("\nSelect Option: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input!");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Student Management ---");
                    System.out.println("1. Register Student");
                    System.out.println("2. Display All Students");
                    System.out.println("3. Update Student");
                    System.out.println("4. Remove Student");
                    System.out.print("Select Action: ");

                    int studentChoice = sc.nextInt();
                    sc.nextLine();

                    if (studentChoice == 1) {
                        System.out.print("Enter Full Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Student ID: ");
                        String sId = sc.nextLine();
                        System.out.print("Enter Program: ");
                        String program = sc.nextLine();
                        studentService.addStudent(new Student(name, sId, sId, program));
                    } else if (studentChoice == 2) {
                        studentService.displayAllStudents();
                    } else if (studentChoice == 3) {
                        System.out.print("Enter Student ID to update: ");
                        String id = sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String nName = sc.nextLine();
                        System.out.print("Enter New Program: ");
                        String nProg = sc.nextLine();
                        studentService.updateStudent(id, nName, nProg);
                    } else if (studentChoice == 4) {
                        System.out.print("Enter Student ID to remove: ");
                        String id = sc.nextLine();
                        studentService.removeStudent(id);
                    }
                    break;

                case 2:
                    System.out.println("\n--- Instructor Management ---");
                    System.out.println("1. Register Instructor");
                    System.out.println("2. Display All Instructors");
                    System.out.println("3. Update Instructor");
                    System.out.println("4. Remove Instructor");
                    System.out.print("Select Action: ");

                    int instructorChoice = sc.nextInt();
                    sc.nextLine();

                    if (instructorChoice == 1) {
                        System.out.print("Enter Full Name: ");
                        String iName = sc.nextLine();
                        System.out.print("Enter Employee ID: ");
                        String eId = sc.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();
                        instructorService.addInstructor(new Instructor(iName, eId, eId, dept));
                    } else if (instructorChoice == 2) {
                        instructorService.displayAllInstructors();
                    } else if (instructorChoice == 3) {
                        System.out.print("Enter Instructor ID to update: ");
                        String id = sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String nName = sc.nextLine();
                        System.out.print("Enter New Department: ");
                        String nDept = sc.nextLine();
                        instructorService.updateInstructor(id, nName, nDept);
                    } else if (instructorChoice == 4) {
                        System.out.print("Enter Instructor ID to remove: ");
                        String id = sc.nextLine();
                        instructorService.removeInstructor(id);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Course Management ---");
                    System.out.println("1. Add Course");
                    System.out.println("2. Display All Courses");
                    System.out.println("3. Update Course");
                    System.out.println("4. Remove Course");
                    System.out.print("Select Action: ");

                    int courseChoice = sc.nextInt();
                    sc.nextLine();

                    if (courseChoice == 1) {
                        System.out.print("Enter Course ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String cName = sc.nextLine();
                        System.out.print("Enter Program: ");
                        String cProg = sc.nextLine();
                        System.out.print("Enter Units: ");
                        int units = sc.nextInt();
                        courseService.addCourse(new Courses(id, cName, cProg, units));
                    } else if (courseChoice == 2) {
                        for (Courses c : courseService.getAllCourses()) {
                            c.display();
                        }
                    } else if (courseChoice == 3) {
                        System.out.print("Enter Course ID to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String nName = sc.nextLine();
                        System.out.print("Enter New Program: ");
                        String nProg = sc.nextLine();
                        System.out.print("Enter New Units: ");
                        int nUnits = sc.nextInt();
                        courseService.updateCourse(new Courses(id, nName, nProg, nUnits));
                    } else if (courseChoice == 4) {
                        System.out.print("Enter Course ID to remove: ");
                        int id = sc.nextInt();
                        courseService.removeCourse(id);
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("System shutting down...");
                    break;

                default:
                    System.out.println("Option not available.");
            }
        }
        sc.close();
    }
}