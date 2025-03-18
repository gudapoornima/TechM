package com.app.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.Employee;

@RestController
public class EmployeeController {
     @GetMapping("/showA")
     public String showA() {
    	 return "A simple Rest Api Application";
     }
     
     @GetMapping("/showB")
     public Employee showB() {
    	 return new Employee(22,"Sai",75000.0);
     }
     
     @GetMapping("/showC")
     public List<Employee> showC() {
    	 return Arrays.asList(new Employee(22,"Venkata",50000), 
    			              new Employee(23,"Ramana",67000));
     }
     
     @GetMapping("/showD")
     public Map<String,Employee>showD(){
    	 Map<String,Employee> map = new HashMap<>();
    	 map.put("e1", new Employee(22,"Harsha",80000.0));
    	 map.put("e2", new Employee(24,"Kiran",60000.0));
    	 return map;
     }
     
     @GetMapping("/showE")
     public ResponseEntity<String>showE(){
    	 ResponseEntity<String> resp= new ResponseEntity<String>("Hello RE",HttpStatus.OK);
    	 return resp;
     }
}
