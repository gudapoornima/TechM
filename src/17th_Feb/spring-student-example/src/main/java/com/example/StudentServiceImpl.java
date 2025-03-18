package com.example;

public class StudentServiceImpl implements StudentService {
    @SuppressWarnings("unused")
	private Student student;

    // Interface Injection (Setter method)
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void registerStudent(Student student) {
        System.out.println("Registering Student:");
        student.display();
    }
}

