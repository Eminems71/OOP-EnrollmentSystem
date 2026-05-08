package org.example;

import org.example.service.*;
import org.example.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IStudentService studentService = new StudentServiceImpl();
        boolean running = true;

        while (running) {
            System.out.println("\n===========================================");
            System.out.println("==============ENROLLMENT SYSTEM==============");
            System.out.println("=============================================");
            System.out.println("1. Student Management");
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
                    sc.nextLine();
                    System.out.println("\n--- Student Registration ---");

                    System.out.print("Enter Full Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    String sId = sc.nextLine();

                    System.out.print("Enter Program: ");
                    String program = sc.nextLine();


                    Student newStudent = new Student(name, sId, sId, program);

                    studentService.addStudent(newStudent);
                    studentService.displayAllStudents();
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