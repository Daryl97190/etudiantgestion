package com.m2i.etudiantgestion.controller;

import com.m2i.etudiantgestion.entity.Student;
import com.m2i.etudiantgestion.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {

        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
        
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

        // Récupérer étudiant de la base de donnée par son id

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail((student.getEmail()));

        // Enregistrer et mettre à jour  l'étudiant

        studentService.updateStudent(existingStudent);
        return "redirect:/students";

    }
    // Methode qui supprimer un étudiant par son id
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {

        studentService.deleteStudentById(id);
        return "redirect:/students";


    }
}
