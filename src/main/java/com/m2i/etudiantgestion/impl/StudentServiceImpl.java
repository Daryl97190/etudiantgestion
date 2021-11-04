package com.m2i.etudiantgestion.impl;

import java.util.List;

import com.m2i.etudiantgestion.entity.Student;
import com.m2i.etudiantgestion.repository.StudentRepository;
import com.m2i.etudiantgestion.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudents() {
        
        return studentRepository.findAll();
    }
    
}
