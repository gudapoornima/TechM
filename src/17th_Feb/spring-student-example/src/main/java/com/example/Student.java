package com.example;

public class Student {
    private int id;
    private String name;

    // Default Constructor
    public Student() {}

    // Constructor Injection
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter & Setter Methods for Setter Injection
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Display method to test injection
    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}
