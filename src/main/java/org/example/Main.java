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
                        System.out.print("Enter ID to update: ");
                        String id = sc.nextLine();
                        System.out.print("New Name: ");
                        String nName = sc.nextLine();
                        System.out.print("New Program: ");
                        String nProg = sc.nextLine();
                        studentService.updateStudent(id, nName, nProg);
                    } else if (studentChoice == 4) {
                        System.out.print("Enter ID to remove: ");
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
                        System.out.print("Full Name: ");
                        String iName = sc.nextLine();
                        System.out.print("Employee ID: ");
                        String eId = sc.nextLine();
                        System.out.print("Department: ");
                        String dept = sc.nextLine();
                        instructorService.addInstructor(new Instructor(iName, eId, eId, dept));
                    } else if (instructorChoice == 2) {
                        instructorService.displayAllInstructors();
                    } else if (instructorChoice == 3) {
                        System.out.print("Enter ID to update: ");
                        String id = sc.nextLine();
                        System.out.print("New Name: ");
                        String nName = sc.nextLine();
                        System.out.print("New Dept: ");
                        String nDept = sc.nextLine();
                        instructorService.updateInstructor(id, nName, nDept);
                    } else if (instructorChoice == 4) {
                        System.out.print("Enter ID to remove: ");
                        String id = sc.nextLine();
                        instructorService.removeInstructor(id);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Course & Section Management ---");
                    System.out.println("1. Add Course");
                    System.out.println("2. Display All Courses");
                    System.out.println("3. Update Course");
                    System.out.println("4. Remove Course");
                    System.out.println("5. Add Section to Course");
                    System.out.println("6. View Sections (Hierarchy)");
                    System.out.print("Select Action: ");
                    int courseChoice = sc.nextInt();
                    sc.nextLine();

                    if (courseChoice == 1) {
                        System.out.print("Course ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Course Name: ");
                        String cName = sc.nextLine();
                        System.out.print("Program: ");
                        String cProg = sc.nextLine();
                        System.out.print("Units: ");
                        int units = sc.nextInt();
                        courseService.addCourse(new Courses(id, cName, cProg, units));
                    } else if (courseChoice == 2) {
                        for (Courses c : courseService.getAllCourses()) {
                            c.display();
                        }
                    } else if (courseChoice == 3) {
                        System.out.print("ID to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("New Name: ");
                        String nName = sc.nextLine();
                        System.out.print("New Prog: ");
                        String nProg = sc.nextLine();
                        System.out.print("New Units: ");
                        int nUnits = sc.nextInt();
                        courseService.updateCourse(new Courses(id, nName, nProg, nUnits));
                    } else if (courseChoice == 4) {
                        System.out.print("ID to remove: ");
                        int id = sc.nextInt();
                        courseService.removeCourse(id);
                    } else if (courseChoice == 5) {
                        System.out.print("Section Code: ");
                        String sCode = sc.nextLine();
                        System.out.print("Capacity: ");
                        int cap = sc.nextInt();
                        System.out.print("Link Course ID: ");
                        int linkId = sc.nextInt();
                        Courses linkedCourse = courseService.getCourseById(linkId);
                        if (linkedCourse != null) {
                            Section newSec = new Section(sCode, cap, linkedCourse);
                            enrollmentService.addSection(newSec);
                            System.out.println("Section created.");
                        } else {
                            System.out.println("Course not found!");
                        }
                    } else if (courseChoice == 6) {
                        enrollmentService.viewDepartmentHierarchy();
                    }
                    break;

                case 4:
                    System.out.println("\n--- Tuition Fee Management ---");
                    sc.nextLine();
                    System.out.print("Student ID: ");
                    String sIdSearch = sc.nextLine();
                    Student fStudent = studentService.getStudentById(sIdSearch);
                    if (fStudent != null) {
                        System.out.println("1. Calculate Tuition\n2. Make Payment\n3. Check Balance");
                        int tAct = sc.nextInt();
                        if (tAct == 1) {
                            System.out.println("Total: PHP " + tuitionService.calculateFee(fStudent));
                        } else if (tAct == 2) {
                            System.out.print("Amount: ");
                            tuitionService.makePayment(fStudent, sc.nextDouble());
                        } else if (tAct == 3) {
                            System.out.println("Balance: PHP " + tuitionService.getRemainingBalance(fStudent));
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Enrollment ---");
                    sc.nextLine();
                    System.out.print("Student ID: ");
                    String stId = sc.nextLine();
                    System.out.print("Section Code: ");
                    String seCode = sc.nextLine();
                    Student stud = studentService.getStudentById(stId);
                    Section sec = null;
                    if (enrollmentService instanceof EnrollmentServiceImpl) {
                        sec = ((EnrollmentServiceImpl) enrollmentService).getSectionByCode(seCode);
                    }
                    if (stud != null && sec != null) {
                        enrollmentService.enrollStudentInSection(stud, sec);
                    } else {
                        System.out.println("Error in ID or Code.");
                    }
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid.");
            }
        }
        sc.close();
    }
}