package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
