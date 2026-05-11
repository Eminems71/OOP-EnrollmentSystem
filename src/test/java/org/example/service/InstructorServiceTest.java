package org.example.service;

import org.example.model.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class InstructorServiceImplTest {
    private InstructorServiceImpl instructorService;
    private Instructor testInstructor;

    @BeforeEach
    void setUp() {
        instructorService = new InstructorServiceImpl();
        testInstructor = new Instructor("Sir Mawel", "INST-001", "password123", "CICS");
    }

    @Test
    @DisplayName("Should add and retrieve instructor correctly")
    void testAddAndGetInstructor() {
        instructorService.addInstructor(testInstructor);
        Instructor found = instructorService.getInstructorById("INST-001");
        assertNotNull(found);
        assertEquals("Sir Mawel", found.getPersonName());
    }
}