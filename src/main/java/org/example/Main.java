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
        ITuitionService tuitionService = new TuitionServiceImpl();
        IEnrollmentService enrollmentService = new EnrollmentServiceImpl();

        boolean running = true;

        while (running) {
            System.out.println("\n=============================================");
            System.out.println("==============ENROLLMENT SYSTEM==============");
            System.out.println("=============================================");
            System.out.println("1. Student Management");
            System.out.println("2. Instructor Management");
            System.out.println("3. Course & Section Management");
            System.out.println("4. Tuition & Payments");
            System.out.println("5. Enroll Student in Section");
            System.out.println("0. Exit Program");
            System.out.print("\nSelect Option: ");

            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input! Numbers only.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- Student Management ---");
                    System.out.println("1. Register Student\n2. Display All Students\n3. Update Student\n4. Remove Student");
                    System.out.print("Select Action: ");
                    try {
                        int sAct = Integer.parseInt(sc.nextLine());
                        if (sAct == 1) {
                            System.out.print("Full Name: "); String n = sc.nextLine();
                            System.out.print("Student ID: "); String id = sc.nextLine();
                            System.out.print("Program: "); String p = sc.nextLine();
                            studentService.addStudent(new Student(n, id, id, p));
                        } else if (sAct == 2) studentService.displayAllStudents();
                        else if (sAct == 3) {
                            System.out.print("Enter ID to update: "); String id = sc.nextLine();
                            System.out.print("New Name: "); String nn = sc.nextLine();
                            System.out.print("New Program: "); String np = sc.nextLine();
                            studentService.updateStudent(id, nn, np);
                        } else if (sAct == 4) {
                            System.out.print("Enter ID to remove: "); String id = sc.nextLine();
                            studentService.removeStudent(id);
                        }
                    } catch (Exception e) { System.out.println("Invalid Action."); }
                    break;

                case 2:
                    System.out.println("\n--- Instructor Management ---");
                    System.out.println("1. Register Instructor\n2. Display All Instructors\n3. Update Instructor\n4. Remove Instructor");
                    System.out.print("Select Action: ");
                    try {
                        int iAct = Integer.parseInt(sc.nextLine());
                        if (iAct == 1) {
                            System.out.print("Full Name: "); String n = sc.nextLine();
                            System.out.print("Instructor ID: "); String id = sc.nextLine();
                            System.out.print("Department: "); String d = sc.nextLine();
                            instructorService.addInstructor(new Instructor(n, id, id, d));
                        } else if (iAct == 2) instructorService.displayAllInstructors();
                        else if (iAct == 3) {
                            System.out.print("Enter ID to update: "); String id = sc.nextLine();
                            System.out.print("New Name: "); String nn = sc.nextLine();
                            System.out.print("New Department: "); String nd = sc.nextLine();
                            instructorService.updateInstructor(id, nn, nd);
                        } else if (iAct == 4) {
                            System.out.print("Enter ID to remove: "); String id = sc.nextLine();
                            instructorService.removeInstructor(id);
                        }
                    } catch (Exception e) { System.out.println("Invalid Action."); }
                    break;

                case 3:
                    System.out.println("\n--- Course & Section Management ---");
                    System.out.println("1. Add Course\n2. Display All Courses\n3. Update Course\n4. Remove Course\n5. Add Section\n6. Assign Instructor\n7. View Hierarchy");
                    System.out.print("Select Action: ");
                    try {
                        int cAct = Integer.parseInt(sc.nextLine());
                        if (cAct == 1) {
                            System.out.print("Course ID: "); String id = sc.nextLine();
                            System.out.print("Course Name: "); String n = sc.nextLine();
                            System.out.print("Program: "); String p = sc.nextLine();
                            System.out.print("Units: "); int u = Integer.parseInt(sc.nextLine());
                            courseService.addCourse(new Courses(id, n, p, u));
                        } else if (cAct == 2) {
                            for (Courses c : courseService.getAllCourses()) c.display();
                        } else if (cAct == 5) {
                            System.out.print("Section Code: "); String code = sc.nextLine();
                            System.out.print("Capacity: "); int cap = Integer.parseInt(sc.nextLine());
                            System.out.print("Link Course ID: "); String cid = sc.nextLine();
                            Courses c = courseService.getCourseById(cid);
                            if (c != null) enrollmentService.addSection(new Section(code, cap, c));
                        } else if (cAct == 6) {
                            System.out.print("Enter Instructor ID: "); String iid = sc.nextLine();
                            System.out.print("Enter Section Code: "); String scode = sc.nextLine();
                            Instructor inst = instructorService.getInstructorById(iid);
                            Section sect = null;
                            if (enrollmentService instanceof EnrollmentServiceImpl) {
                                sect = ((EnrollmentServiceImpl) enrollmentService).getSectionByCode(scode);
                            }
                            if (inst != null && sect != null) {
                                sect.setInstructor(inst);
                                System.out.println("Instructor successfully assigned to section.");
                            } else System.out.println("Instructor or Section not found.");
                        } else if (cAct == 7) enrollmentService.viewDepartmentHierarchy();
                    } catch (Exception e) { System.out.println("Error in processing input."); }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    Student s = studentService.getStudentById(sid);
                    if (s != null) {
                        System.out.println("1. Calculate Tuition\n2. Make Payment\n3. Check Balance");
                        try {
                            int tAct = Integer.parseInt(sc.nextLine());
                            if (tAct == 1) System.out.println("Total Tuition Fee: " + tuitionService.calculateFee(s));
                            else if (tAct == 2) {
                                System.out.print("Enter Amount to Pay: ");
                                tuitionService.makePayment(s, Double.parseDouble(sc.nextLine()));
                            } else if (tAct == 3) System.out.println("Remaining Balance: " + tuitionService.getRemainingBalance(s));
                        } catch (Exception e) { System.out.println("Invalid amount or input."); }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Student Enrollment ---");
                    System.out.print("Enter Student ID: "); String stid = sc.nextLine();
                    System.out.print("Enter Section Code: "); String secc = sc.nextLine();
                    Student stu = studentService.getStudentById(stid);
                    Section sec = null;
                    if (enrollmentService instanceof EnrollmentServiceImpl) {
                        sec = ((EnrollmentServiceImpl) enrollmentService).getSectionByCode(secc);
                    }
                    if (stu != null && sec != null) enrollmentService.enrollStudentInSection(stu, sec);
                    else System.out.println("Enrollment failed: Invalid Student ID or Section Code.");
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }
        }
        sc.close();
    }
}