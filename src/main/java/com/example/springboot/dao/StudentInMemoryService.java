package com.example.springboot.dao;

import com.example.springboot.entity.Student;
import com.example.springboot.repository.StudentInMemoryDao;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInMemoryService implements StudentService {
    private final StudentInMemoryDao dao;

    public StudentInMemoryService(StudentInMemoryDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student findEmail(String email) {
        return dao.findEmail(email);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }
}

