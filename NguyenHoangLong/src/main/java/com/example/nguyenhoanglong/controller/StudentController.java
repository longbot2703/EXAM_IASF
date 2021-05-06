package com.example.nguyenhoanglong.controller;

import com.example.nguyenhoanglong.entity.Student;
import com.example.nguyenhoanglong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String index(Model model){
        List<Student> students = studentService.getAllStudent();
        model.addAttribute("students", students);
        return "index";
    }

    @RequestMapping(value = "add")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

}
