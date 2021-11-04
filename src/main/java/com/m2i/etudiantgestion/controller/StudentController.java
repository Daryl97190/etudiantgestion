package com.m2i.etudiantgestion.controller;

import com.m2i.etudiantgestion.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Méthode qui gère la liste des étudiants et retourne la vue
    @GetMapping(value = "/")
    public String listStudent() {

        return "home";
        
    }
    
}
