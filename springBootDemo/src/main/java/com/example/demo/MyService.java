package com.example.demo;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import com.example.demo.person;

@Service
public class MyService {
	Hashtable<String,person> hash = new Hashtable<>();
	public MyService() {
		person ps1 = new person();
		ps1.setName("Vibhu");
		ps1.setEmail("vn@gmail.com");
		ps1.setId("1001");
		Integer id = hash.size()+1;
		hash.put(id.toString(), ps1);
	}
	public MyService(person ps) {
		Integer id = hash.size()+1;
		hash.put(id.toString(),ps);
	}
	public person getPerson(String id) {
		if(hash.containsKey(id))
			return hash.get(id);
		else
			return null;
	}
	public Hashtable<String,person> getAllPerson(){
		return hash;
	}
	public String addPerson(person ps) {
		Integer id = hash.size()+1;
		hash.put(id.toString(),ps);
		return "Successfully added";
		
	}
}
