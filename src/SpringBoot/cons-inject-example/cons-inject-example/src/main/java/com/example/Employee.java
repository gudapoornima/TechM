package com.example;
//constructor injection
//bean component
public class Employee {
   //instance variables
	private int id;
	private String name;
	
	//default constructor
    public Employee() {
    	System.out.println("In Default Constructor");
    }
    //parameterized constructor
    public Employee(int id,String name) {
    	this.id=id;
    	this.name=name;
    }
    
    public void showEmployeeDetails() {
    	System.out.println("Employee Id is" +  " " +id);
    	System.out.println("Employee Name is" + " " + name);
    }
}
