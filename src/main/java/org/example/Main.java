package org.example;

import org.example.service.*;
import org.example.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IStudentService studentService = new StudentServiceImpl();
        IInstructorService instructorService = new InstructorServiceImpl();
        boolean running = true;

        while (running) {
            System.out.println("\n=============================================");
            System.out.println("==============ENROLLMENT SYSTEM==============");
            System.out.println("=============================================");
            System.out.println("1. Student Management");
            System.out.println("2. Instructor Management");
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

                    } else {
                        System.out.println("Invalid action!");
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("\n--- Instructor Registration ---");
                    System.out.print("Enter Full Name: ");
                    String iName = sc.nextLine();
                    System.out.print("Enter Employee ID: ");
                    String eId = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    Instructor newInstructor = new Instructor(iName, eId, eId, dept);
                    instructorService.addInstructor(newInstructor);

                    System.out.println("\n--- Registered Details ---");
                    instructorService.getInstructorDetails(newInstructor);
                    break;

                case 0:
                    running = false;
                    System.out.println("System shutting down... Goodbye!");
                    break;

                default:
                    System.out.println("Option not available.");
            }
        }
        sc.close();
    }
}