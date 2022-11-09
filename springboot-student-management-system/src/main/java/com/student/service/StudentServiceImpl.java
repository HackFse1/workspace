package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;

@Service
public class StudentServiceImpl implements IStudentService {
	
	
	@Autowired
	IStudentRepository studentRepository;
	
	public Integer addStudent(StudentEntity student) {
		StudentEntity savedStudent = studentRepository.save(student);
		return savedStudent.getId();
	}
	
	public Optional<StudentEntity> getStudent(Integer id) {
		Optional<StudentEntity> receivedStudent = studentRepository.findById(id);
		return receivedStudent;
	}
	
	public List<StudentEntity> getStudents() {
		return studentRepository.findAll();
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	
	public List<StudentEntity> getStudentThroughName(String name) {
		return studentRepository.getStudentByFirstname(name);
	}
	
	public Integer updateStudent(StudentEntity student) {
		StudentEntity updatedStudent = studentRepository.save(student);
		return updatedStudent.getId();
	}
}
