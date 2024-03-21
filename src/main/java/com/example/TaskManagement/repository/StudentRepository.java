package com.example.TaskManagement.repository;

import com.example.TaskManagement.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public Student findByStudentEmail(String studentEmail);
}
