package com.attendanceapp.mytry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendanceapp.mytry.entity.*;
import com.attendanceapp.mytry.service.StudentService;

@RestController
@RequestMapping("/attendance")
public class StudentController {
	 @Autowired
	    private StudentService studentService;
	 @GetMapping("/attendance")
	    public String showAttendancePage() {
	        return "attendance"; // This corresponds to the HTML file name without the extension
	    }

	 @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	        	
	        }
	        
	 @GetMapping("/{id}")
	    public Student getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }
	 
	 @PostMapping
	    public void saveStudent(@RequestBody Student student) {
	        studentService.saveStudent(student);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	    }
	    
	    
}


