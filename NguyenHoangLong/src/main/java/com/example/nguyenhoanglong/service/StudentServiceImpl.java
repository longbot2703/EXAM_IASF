package com.example.nguyenhoanglong.service;

import com.example.nguyenhoanglong.entity.Student;
import com.example.nguyenhoanglong.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
