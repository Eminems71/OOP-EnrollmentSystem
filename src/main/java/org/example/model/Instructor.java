package org.example.model;

public class Instructor extends Person {
    private String employeeId;
    private String department;

    public Instructor(String name, String personId, String employeeId, String department) {
        super(name, personId);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void mainTask() {
        System.out.println("Teaching in department: " + department);
    }
}