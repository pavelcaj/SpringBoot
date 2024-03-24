package com.example.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.time.LocalDate;
@Entity
@Table(name="student")
public class Student {


    @Id
    @GeneratedValue
    private int Id;
    private String firstName;
    private String lastName;
    private LocalDate date;
    @Column(unique = true)
    private String email;
    @Transient
    private  int age;
    public Student() {
    }

    public Student(String firstName,
                   String lastName,
                   LocalDate date,
                   String email,
                   int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
