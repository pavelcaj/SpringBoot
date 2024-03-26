package com.example.springboot.repository;

import com.example.springboot.entity.Student;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);

    void deleteBy(String email);
}
