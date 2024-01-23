package com.attendanceapp.mytry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.attendanceapp.mytry.entity.*;
import com.attendanceapp.mytry.repository.*;

@Service
public class StudentService {
	 @Autowired
	    private StudentRepository studentRepository;

	 public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    public Student getStudentById(Long id) {
	        return studentRepository.findById(id).orElse(null);
	    }

	    public void saveStudent(Student student) {
	        studentRepository.save(student);
	    }

	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }

		
		

	    

		
	

}
