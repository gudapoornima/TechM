package com.example;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeClient {
public static void main(String args[]) {
    //include the xml file
	Resource res = new ClassPathResource("config.xml");
	@SuppressWarnings("deprecation")
	//invoking the xml file.
	BeanFactory factory = new XmlBeanFactory(res);
	//calling the bean component
	Employee empObj = (Employee)factory.getBean("empBean");
	empObj.showEmployeeDetails();
}
}
