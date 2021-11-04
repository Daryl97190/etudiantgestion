package com.m2i.etudiantgestion.repository;

import com.m2i.etudiantgestion.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
