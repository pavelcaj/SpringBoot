package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import com.example.springboot.service.DBStudentService;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class StudentController {
    @PostMapping
    public Student save(
            @RequestBody Student student
    ) {
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findEmail(
            @PathVariable("email") String email) {
        return studentService.findEmail(email);

    }

    @PutMapping
    public Student updateStudent(
            @RequestBody Student student
    ) {
        return studentService.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable("email") String email
    ) {
        studentService.delete(email);
    }

    private StudentService studentService;

    @Autowired
    public StudentController(
            @Qualifier("DBStudentService") StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();

    }
}
