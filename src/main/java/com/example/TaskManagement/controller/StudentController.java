package com.example.TaskManagement.controller;

import com.example.TaskManagement.modal.Student;
import com.example.TaskManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
           return studentService.addStudent(student);
    }

    @GetMapping("/fetchAll")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/fetchById")
    public Student fetchByStudentId(Integer studentId)
    {
        return studentService.fetchByStudentId(studentId);
    }

}
