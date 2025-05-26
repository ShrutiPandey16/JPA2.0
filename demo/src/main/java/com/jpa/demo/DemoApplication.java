package com.jpa.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.demo.model.Student;
import com.jpa.demo.repo.*;

@SpringBootApplication
public class DemoApplication {

	@Autowired
    private final StudentRepo studentRepo;

    DemoApplication(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(1);
//		s1.setName("Anwesha");
//		s1.setMarks(100);
//
//		s2.setRollNo(2);
//		s2.setName("Ritu");
//		s2.setMarks(90);
//
//		s3.setRollNo(3);
//		s3.setName("Shruti");
//		s3.setMarks(80);
		
//		System.out.println(repo.findAll());
		Optional<Student> stud = repo.findById(2);
		System.out.println(stud.orElse(new Student()));
		
		System.out.println(repo.findByName("Shruti"));
		System.out.println(repo.findByMarksGreaterThan(80));
	}

}
