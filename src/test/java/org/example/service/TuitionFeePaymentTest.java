package org.example.service;

import static org.junit.jupiter.api.Assertions.*;
import org.example.model.Student;
import org.example.model.Courses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class TuitionFeePaymentTest {
    private ITuitionService tuitionService;
    private Student testStudent;

    @BeforeEach
    void setup() {
        tuitionService = new TuitionServiceImpl();
        testStudent = new Student("Juan Dela Cruz", "ID-123", "password123", "BSIT");

        Courses majorCourse = new Courses("IT101", "Java Programming", "BSIT", 50);
        testStudent.getEnrolledCourses().add(majorCourse);
    }

    @Test
    @DisplayName("Should calculate 25000 tuition for 50 units")
    void shouldCalculateCorrectTuitionFee() {
        double result = tuitionService.calculateFee(testStudent);
        assertEquals(25000.00, result);
    }

    @Test
    @DisplayName("Should update balance correctly after payment")
    void shouldProcessPaymentAndCheckBalance() {
        tuitionService.calculateFee(testStudent);
        tuitionService.makePayment(testStudent, 5000.00);
        double remaining = tuitionService.getRemainingBalance(testStudent);
        assertEquals(20000.00, remaining);
    }
}