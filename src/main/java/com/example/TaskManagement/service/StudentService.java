package com.example.TaskManagement.service;

import com.example.TaskManagement.modal.Student;
import com.example.TaskManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public String addStudent(Student student)
    {
        if(studentRepository.findByStudentEmail(student.getStudentEmail())==null) {

            studentRepository.save(student);
            return "Data added successfully";
        }
        else {
            return "Data already exists";
        }
    }

    public List<Student> getAllStudents()
    {

            List<Student> studentList = studentRepository.findAll();
            if (!studentList.isEmpty()) {
                return studentList;
            }
            else {
                return new ArrayList<>();
            }

    }

    public Student fetchByStudentId(Integer studentId)
    {

            Optional<Student> optionalStudent = studentRepository.findById(studentId);
            if (optionalStudent.isPresent()) {
                return optionalStudent.get();
            }
            else
            {
                return null;
            }


    }
}
