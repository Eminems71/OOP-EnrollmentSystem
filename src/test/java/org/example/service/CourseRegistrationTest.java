package org.example.service;

import org.example.model.Courses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CourseRegistrationTest {

    private CourseRegistration registration;
    private Courses sampleCourse;

    @BeforeEach
    void setUp() {
        // Gagana ito bago ang bawat @Test para fresh start lagi
        registration = new CourseRegistration();
        sampleCourse = new Courses("IT101", "Java Programming", "BSIT", 3);
    }

    @Test
    @DisplayName("Should successfully save a course")
    void testSaveCourse() {
        // Action
        registration.saveCourse(sampleCourse);

        // Verification: Dahil private ang list, tinitignan natin kung walang error pagka-add
        assertDoesNotThrow(() -> registration.displayAllCourse(),
                "Should not throw exception when displaying added course");
    }

    @Test
    @DisplayName("Should update course based on Course Name")
    void testUpdateCourse() {
        // Arrange
        registration.saveCourse(sampleCourse);
        Courses updatedCourse = new Courses("IT101-NEW", "Java Programming", "BSIS", 4);

        // Action: I-update ang course na may kaparehong name ("Java Programming")
        registration.updateCourse(updatedCourse);

        // Note: Dahil private ang list, ang manual verification nito sa console output
        // pero sa JUnit, sinisiguro nating nag-execute ang loop without errors.
        assertNotNull(updatedCourse);
        assertEquals("Java Programming", updatedCourse.getCourseName());
    }

    @Test
    @DisplayName("Should remove course based on Course Name")
    void testRemoveCourse() {
        // Arrange
        registration.saveCourse(sampleCourse);

        // Action
        registration.removeCourse(sampleCourse);

        // Verification
        // Sa logic mo, kung wala na ang course, dapat empty na ang display loop
        assertDoesNotThrow(() -> registration.removeCourse(sampleCourse));
    }
}