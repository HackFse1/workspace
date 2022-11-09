package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService studentService;
	
	@PostMapping("/student")
	public Integer createStudent(@RequestBody StudentEntity student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Optional<StudentEntity> getStudent(@PathVariable Integer id) {
		return studentService.getStudent(id);
	}
	
	
	@GetMapping("/students")
	public List<StudentEntity> getStudents() {
		return studentService.getStudents();
	}
	
//	@DeleteMapping("/delete/{id}")
//	public void deleteStudent(@PathVariable Integer id) {
//		studentService.deleteStudent(id);
//	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<StudentEntity> deleteStudent(@PathVariable Integer id) {
		
		ResponseEntity<StudentEntity> responseEntity = new ResponseEntity<StudentEntity>(HttpStatus.OK);

		
		try {			
			studentService.deleteStudent(id);
		} catch(Exception e) {
			e.printStackTrace();
			responseEntity  = new ResponseEntity<StudentEntity>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	@GetMapping("/student/name/{name}")
	public List<StudentEntity> getStudentThroughName(@PathVariable String name) {
		return studentService.getStudentThroughName(name);
	}
	
	@PutMapping("/student/update/{id}")
	public Integer updatingStudent(@RequestBody StudentEntity student) {
		return studentService.updateStudent(student);
	}
	
	
	
	
	
	
	
	
}
