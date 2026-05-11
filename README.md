# OOP ENROLLMENT SYSTEM
Author: Redel Aguila

---

Project Vision and Architectural Thinking

This project represents a transition from basic procedural coding to a Modular Software Architecture. The Enrollment System is built on a Service-Oriented structure where data models are strictly separated from business logic services. This decoupling ensures that the system is scalable, organized, and easy to maintain, mirroring how professional enterprise applications are built.

The OOP Evolutionary Roadmap

I established a robust identity hierarchy starting with the Person base class. By using private access modifiers and public getters and setters, I ensured strict Encapsulation which protects sensitive data like Student IDs and Instructor records. The Student and Instructor classes utilize super constructors to inherit core identities while maintaining their unique attributes such as student programs for students and departmental data for instructors.

To maintain logical consistency, I defined the Person class as an Abstract Class. The logic here is that an entity cannot simply be a generic person in this system; they must have a specific role. By defining an abstract method like mainTask, I forced the system to recognize that every entity must have a professional function. For the Student, the implementation focuses on academic learning, while for the Instructor, the implementation focuses on educational instruction.

Through method overriding, the system demonstrates Polymorphism. The display method behaves differently depending on whether it is called by a Student object or a Courses object. This allows the Main controller to handle different object types uniformly while executing their specific logic.

Complex Institutional Mapping and Business Logic

The project successfully maps real-world academic relationships through entity linking and capacity management. Using the maxCapacity and enrolledCount logic in the Courses model, the system tracks real-time availability to ensure that enrollment does not exceed institutional limits. One of the core features is the TuitionFeePayment service, which handles the financial engine of the university. It performs unit-based calculations where fees are dynamically calculated based on the number of units in a Courses object. This ensures financial integrity by linking every transaction to a specific student record.

Quality Assurance and Technical Stack

To ensure the system is production-ready, I implemented a suite of Automated Unit Tests using JUnit 5. Each test follows the Arrange, Act, and Assert pattern. Specifically, I developed tests to verify the tuition calculation logic, ensuring that the system produces accurate financial data. The technical stack for this project includes Java JDK 21, JUnit 5 for testing, Maven as the build tool, and Git for version control using a Feature Branch Workflow involving Main, FINALS, and specific feature branches.









## **Encapsulation**
![Redel.png](src/main/resources/images/Redel.png)

## **Inheritance**
![SS - EM.png](src/main/resources/images/SS - EM.png)

## **Abstract**
![INSTRUCTOR.java.png](src/main/resources/images/INSTRUCTOR.java.png)
![PERSON.java.png](src/main/resources/images/PERSON.java.png)
![STUDENT.java.png](src/main/resources/images/STUDENT.java.png)

## **FINALS**

## model
Courses
![Courses.png](target/classes/images/Courses.png)

Database
![Database.png](target/classes/images/Database.png)

Department
![Department.png](target/classes/images/Department.png)

Instructor
![Instructor.png](target/classes/images/Instructor.png)

Person
![Person.png](target/classes/images/Person.png)

Section
![Section.png](target/classes/images/Section.png)

Student
![Student.png](target/classes/images/Student.png)

TuitionFeePayment
![TuitionFeePayment.png](target/classes/images/TuitionFeePayment.png)

## service

ICourseService
![ICourseService.png](target/classes/images/ICourseService.png)

IEnrollmentService
![IEnrollmentService.png](target/classes/images/IEnrollmentService.png)

IInstructorService
![IInstructorService.png](target/classes/images/IInstructorService.png)

IStudentService
![IStudentService.png](target/classes/images/IStudentService.png)

ITuitionService
![ITuitionService.png](target/classes/images/ITuitionService.png)

EnrollmentServiceImpl
![EnrollmentServiceImpl.png](target/classes/images/EnrollmentServiceImpl.png)

TuitionServiceImpl
![TuitionServiceImpl.png](target/classes/images/TuitionServiceImpl.png)

CourseServiceImpl
![CourseServiceImpl.png](target/classes/images/CourseServiceImpl.png)

InstructorServiceImpl
![InstructorServiceImpl.png](target/classes/images/InstructorServiceImpl.png)

StudentServiceImpl
![StudentServiceImpl.png](target/classes/images/StudentServiceImpl.png)

## test

CourseRegistrationTest
![CourseRegistrationTest.png](target/classes/images/CourseRegistrationTest.png)

EnrollmentServiceTest
![EnrollmentServiceTest'.png](target/classes/images/EnrollmentServiceTest%27.png)

InstructorServiceTest
![InstructorServiceTest.png](target/classes/images/InstructorServiceTest.png)

StudentRegistrationTest
![StudentRegistrationTest.png](target/classes/images/StudentRegistrationTest.png)

TuitionFeePaymentTest
![TuitionFeePaymentTest.png](target/classes/images/TuitionFeePaymentTest.png)


JUnitTesting
![JUnitTesting.png](target/classes/images/JUnitTesting.png)


Main
![Main.png](target/classes/images/Main.png)