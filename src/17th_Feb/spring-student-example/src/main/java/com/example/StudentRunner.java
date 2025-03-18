package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {
    public static void main(String[] args) {
        // Load Spring Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Fetch Student beans (Constructor & Setter Injection)
        Student student1 = (Student) context.getBean("student1");
        student1.display();

        Student student2 = (Student) context.getBean("student2");
        student2.display();

        // Fetch StudentService bean (Interface Injection)
        StudentService service = (StudentService) context.getBean("studentService");
        service.registerStudent(student1);
        
        // Close Context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
