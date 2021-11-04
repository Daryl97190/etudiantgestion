package com.m2i.etudiantgestion.controller;

import com.m2i.etudiantgestion.entity.Student;
import com.m2i.etudiantgestion.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Méthode qui gère la liste des étudiants et retourne la vue
    @GetMapping(value = "/students")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {

        // Créer un étudiant grace au formulaire
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";

    }
@PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
        
    }
    
}
