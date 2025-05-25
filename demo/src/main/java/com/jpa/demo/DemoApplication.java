package com.jpa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.demo.model.Student;
import com.jpa.demo.repo.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Anwesha");
		s1.setMarks(100);

		s2.setRollNo(2);
		s2.setName("Ritu");
		s2.setMarks(90);

		s3.setRollNo(3);
		s3.setName("Shruti");
		s3.setMarks(80);
		
		repo.save(s2);
		repo.save(s3);
	}

}
