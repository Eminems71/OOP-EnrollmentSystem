package org.example.service;

import org.example.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentRegistrationTest {
    private IStudentService studentService;
    private Student testStudent;

    @BeforeEach
    void setUp() {
        studentService = new StudentServiceImpl();
        testStudent = new Student("Redel Emmanuel", "STUD-001", "2024-001", "BSIT");
    }

    @Test
    @DisplayName("Should successfully register a new student")
    void testRegisterStudent() {
        studentService.addStudent(testStudent);
        assertNotNull(studentService.getStudentById("STUD-001"));
    }

    @Test
    @DisplayName("Should not throw error when removing student")
    void testRemoveStudent() {
        studentService.addStudent(testStudent);
        assertDoesNotThrow(() -> studentService.removeStudent("STUD-001"));
    }
}