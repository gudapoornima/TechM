package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRunner {
public static void main(String args[]) {
	//include the XML file
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	//inclusion of DAO file
	EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	//insert query
	int status=dao.saveEmployee(new Employee(120,"Tharun",95000));
	System.out.println("Row Inserted Successfully" +status);
	//try to insert multiple row/s into the table using jdbctemplate.
	
	//deletion of row/s from the table.
	
	/*Employee e=new Employee();
	e.setId(102);
	int status=dao.deleteEmployee(e);
	System.out.println(status);*/
	
  }
}
