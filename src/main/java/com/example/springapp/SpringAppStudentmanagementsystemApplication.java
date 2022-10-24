package com.example.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springapp.entity.Student;
import com.example.springapp.repository.StudentRepository;

@SpringBootApplication
public class SpringAppStudentmanagementsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppStudentmanagementsystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("John", "Mathew", "john@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Henry", "Gerald", "henry@abc.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Tony", "Stark", "stark@abc.com");
//		studentRepository.save(student3);
	}

}
