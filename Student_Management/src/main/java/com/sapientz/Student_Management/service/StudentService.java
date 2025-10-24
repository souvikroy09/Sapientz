package com.sapientz.Student_Management.service;

import java.util.List;

import com.sapientz.Student_Management.model.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

    Student getStudentById(Long id);

    void saveStudent(Student student);

    void deleteStudent(Long id);

}
