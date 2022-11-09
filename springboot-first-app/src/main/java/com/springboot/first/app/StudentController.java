package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Vishal", "Verma");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student("Jana", "Kumar"));
		stud.add(new Student("Rahul", "Kumar"));
		stud.add(new Student("Mira", "Singh"));
		
		return stud;
		
	}
	
}
