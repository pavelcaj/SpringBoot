package com.example.springboot.entity;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate date;
    private String email;
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
}
