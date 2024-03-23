package com.example.springboot.service;

import com.example.springboot.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;



public interface StudentService {
    Student save(Student s);
    public List<Student> findAllStudents();
    Student findEmail(String email);
    void delete (String email);
    Student update(Student s);
   
}
