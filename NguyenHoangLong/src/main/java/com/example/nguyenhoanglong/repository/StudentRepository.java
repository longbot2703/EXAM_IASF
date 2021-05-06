package com.example.nguyenhoanglong.repository;

import com.example.nguyenhoanglong.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
