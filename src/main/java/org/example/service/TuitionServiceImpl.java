package org.example.service;

import org.example.model.Courses;
import org.example.model.Student;
import java.util.HashMap;
import java.util.Map;

public class TuitionServiceImpl implements ITuitionService {
    private static final double RATE_PER_UNIT = 500.0;
    private Map<String, Double> payments = new HashMap<>();

    @Override
    public double calculateFee(Student student) {
        int totalUnits = 0;
        for (Courses course : student.getEnrolledCourses()) {
            totalUnits += course.getUnits();
        }
        return totalUnits * RATE_PER_UNIT;
    }

    @Override
    public void makePayment(Student student, double amount) {
        String id = student.getStudentId();
        payments.put(id, payments.getOrDefault(id, 0.0) + amount);
        System.out.println("Payment of PHP " + amount + " processed for " + student.getPersonName());
    }

    @Override
    public double getRemainingBalance(Student student) {
        double totalTuition = calculateFee(student);
        double totalPaid = payments.getOrDefault(student.getStudentId(), 0.0);
        return totalTuition - totalPaid;
    }
}