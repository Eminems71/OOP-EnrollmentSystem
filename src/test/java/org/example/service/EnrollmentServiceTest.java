package org.example.service;

import org.example.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class EnrollmentServiceImplTest {
    private EnrollmentServiceImpl enrollmentService;
    private Section testSection;
    private Student testStudent;

    @BeforeEach
    void setUp() {
        enrollmentService = new EnrollmentServiceImpl();
        Courses javaCourse = new Courses("IT101", "Java", "BSIT", 3);
        testSection = new Section("S1", 1, javaCourse);
        testStudent = new Student("Juan", "S1", "S1", "BSIT");
    }

    @Test
    @DisplayName("Should enroll student when capacity is available")
    void testEnrollSuccess() {
        enrollmentService.addSection(testSection);
        enrollmentService.enrollStudentInSection(testStudent, testSection);
        assertEquals(1, testSection.getEnrolledStudents(1).size());
    }

    @Test
    @DisplayName("Should fail enrollment when section is full")
    void testEnrollmentFull() {
        enrollmentService.addSection(testSection);
        enrollmentService.enrollStudentInSection(testStudent, testSection);

        Student anotherStudent = new Student("Pedro", "S2", "S2", "BSIT");
        enrollmentService.enrollStudentInSection(anotherStudent, testSection);

        assertEquals(1, testSection.getEnrolledStudents(1).size());
    }
}