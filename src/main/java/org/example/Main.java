package org.example;

import org.example.service.*;
import org.example.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===========================================");
            System.out.println("==============ENROLLMENT SYSTEM============== ");
            System.out.println("=============================================");
            System.out.println("1. Student Management (CRUD)");
            System.out.println("2. Instructor Management (CRUD)");
            System.out.println("3. Course Management (CRUD)");
            System.out.println("4. Enrollment & Capacity Check");
            System.out.println("5. Tuition Management");
            System.out.println("6. View Institutional Hierarchy");
            System.out.println("0. Exit Program");
            System.out.print("\nSelect Option: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n[Student Management Mode]");
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