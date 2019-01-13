package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.PathVariable;   

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;     
@RestController  
@RequestMapping("myService")
public class myController {
	
	@Autowired
	MyService service;


	@RequestMapping("/userList")  
    public Hashtable<String,person> getAll(){  
        return service.getAllPerson();  
    }  

	@RequestMapping("/addUser")  
    public Hashtable<String,person> getAllWithPusOne(){  
    	person ps = new person();
    	ps.setName("Vibhuti");
    	ps.setEmail("vibhu@gmail.com");
    	ps.setId("10001");
    	service.addPerson(ps);
        return service.getAllPerson();  
    }  

	@RequestMapping("/user/{id}")  
    public person singleUser(@PathVariable("id") String id){  
        return service.getPerson(id); 
    }  
	
	@RequestMapping("/hello")  
    public String hello(){  
        return"{\"name\":\"Vibhuti\"}";  
    }  
}
