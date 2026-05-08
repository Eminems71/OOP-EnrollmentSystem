package org.example.service;

import static org.junit.jupiter.api.Assertions.*;
import org.example.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TuitionFeePaymentTest {
    private ITuitionService tuitionService;
    private Student testStudent;

    @BeforeEach
    void setup() {
        tuitionService = new TuitionServiceImpl();
        testStudent = new Student("Juan Dela Cruz", "ID-123", "S1001", "BSIT");
    }

    @Test
    void shouldCalculateCorrectTuitionFee() {
        double result = tuitionService.calculateFee(testStudent);
        assertEquals(25000.00, result);
    }

    @Test
    void shouldProcessPaymentWithoutError() {
        assertDoesNotThrow(() -> {
            tuitionService.makePayment(testStudent, 5000.00);
        });
    }
}