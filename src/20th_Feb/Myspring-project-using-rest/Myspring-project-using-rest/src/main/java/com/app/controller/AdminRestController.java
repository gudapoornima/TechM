package com.app.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")     
public class AdminRestController {
       @GetMapping("/show")
       public String helloMsgGet() {
    	   return "Get Request Message";
       }
       
       @PostMapping("/show")
       public String helloMsgPost() {
    	   return "Post Request Message";
       }
       
       @PutMapping("/show")
       public String helloMsgPut() {
    	   return "Put Request Message";
       }
       
       @DeleteMapping("/show")
       public String helloMsgDelete() {
    	   return "Delete Request Mapping";
       }
       
       @PatchMapping("/show")
       public String helloMsgPatch() {
    	   return "Patch Request Mapping";
       }       		
}