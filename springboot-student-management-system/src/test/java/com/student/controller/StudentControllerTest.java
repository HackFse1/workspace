package com.student.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.student.entity.StudentEntity;
import com.student.service.IStudentService;



@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

	@InjectMocks
	StudentController controller;	//dependent
	@Mock
	IStudentService service;
	
	@Test
	void testAddStudent() {
		StudentEntity student = new StudentEntity();
		student.setId(1);
		when(service.addStudent(student)).thenReturn(1);
		int id = controller.createStudent(student);
		assertEquals(1, id);
	}
	
	
	@Test
	void testGetStudents() {
		List<StudentEntity> student = new ArrayList<StudentEntity>();
		
		StudentEntity stuOne = new StudentEntity(1,"Ravi","Nair");
		StudentEntity stuTwo = new StudentEntity(2,"Sunil","Nair");
		
		student.add(stuOne);
		student.add(stuTwo);
		
		when(service.getStudents()).thenReturn(student);
		List<StudentEntity> receivedStudent = controller.getStudents();
		assertEquals(student, receivedStudent);
	}
}
