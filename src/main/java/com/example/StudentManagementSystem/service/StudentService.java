package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    public void deleteStudentById(Long id);

}
