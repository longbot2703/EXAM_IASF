package com.example.nguyenhoanglong.service;

import com.example.nguyenhoanglong.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    List<Student> getAllStudent();
    void saveStudent(Student student);
}
