package com.example.springboot.service;

import com.example.springboot.entity.Student;
import com.example.springboot.repository.StudentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DBStudentService implements StudentService {
    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void delete(String email) {
        repository.deleteBy(email);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }
}
