package com.example.lb2;

import org.springframework.data.jpa.repository.JpaRepository;
import students.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

