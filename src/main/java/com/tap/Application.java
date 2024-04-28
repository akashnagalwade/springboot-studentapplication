package com.tap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tap.entity.Student;
import com.tap.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student(102, "Akash", "Nagalwade", "akash@gmail.com", "Navegaon devi",
//				"Computer Science");
//		studentRepository.save(student1);
//
//		Student student2 = new Student(102, "Pranay", "Lute", "pranay@gmail.com", "Nagpur", "Mechanical Engineer");
//		studentRepository.save(student2);
	}

}
