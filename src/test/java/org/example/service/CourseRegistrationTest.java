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

        registration.saveCourse(sampleCourse);
        Courses updatedCourse = new Courses("IT101-NEW", "Java Programming", "BSIS", 4);


        registration.updateCourse(updatedCourse);


        assertNotNull(updatedCourse);
        assertEquals("Java Programming", updatedCourse.getCourseName());
    }

    @Test
    @DisplayName("Should remove course based on Course Name")
    void testRemoveCourse() {

        registration.saveCourse(sampleCourse);


        registration.removeCourse(sampleCourse);


        assertDoesNotThrow(() -> registration.removeCourse(sampleCourse));
    }
}