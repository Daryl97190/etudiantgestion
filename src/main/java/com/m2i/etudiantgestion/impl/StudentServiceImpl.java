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

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {

        studentRepository.deleteById(id);
        // TODO Auto-generated method stub
        
    }    
}
