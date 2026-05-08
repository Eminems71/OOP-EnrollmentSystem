package org.example.service;

import org.example.model.Student;

public interface ITuitionService {
    double calculateFee(Student student);
    void makePayment(Student student, double amount);
    double getRemainingBalance(Student student);
}