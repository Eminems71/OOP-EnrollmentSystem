package org.example.service;

import org.example.model.Student;

public class TuitionServiceImpl implements ITuitionService {

    @Override
    public double calculateFee(Student student) {
        return 25000.00;
    }

    @Override
    public void makePayment(Student student, double amount) {
        if (student != null) {
            System.out.println("Payment of " + amount + " processed for " + student.getPersonName());
        }
    }

    @Override
    public double getRemainingBalance(Student student) {
        return 0.0;
    }
}