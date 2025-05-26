package com.jpa.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    // @Query("Select s from Student s where s.name = ?1")
    List<Student> findByName(String name);

    List<Student> findByMarksGreaterThan(int marks);
}
