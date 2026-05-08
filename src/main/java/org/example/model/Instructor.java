package org.example.model;

public class Instructor extends Person {
    private String firstName;
    private String lastName;
    private String courseName;

    public Instructor(String firstName, String lastName, String personID, String courseName) {
        super(firstName + " " + lastName, personID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void mainTask() {
        System.out.println("Teaching: " + courseName);
    }
}