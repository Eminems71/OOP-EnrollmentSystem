package org.example.service;
import org.example.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private List<Student> students = new ArrayList<>();

    @Override public void addStudent(Student student) { students.add(student); }
    @Override public void updateStudent(Student student) { /* logic here */ }
    @Override public void removeStudent(Student student) { students.remove(student); }
    @Override public List<Student> getAllStudents() { return students; }
}