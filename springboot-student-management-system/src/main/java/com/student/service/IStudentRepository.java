package com.student.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {

	List<StudentEntity> getStudentByFirstname(String name);

}
