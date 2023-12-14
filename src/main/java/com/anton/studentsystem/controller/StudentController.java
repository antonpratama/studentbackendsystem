package com.anton.studentsystem.controller;

import com.anton.studentsystem.model.Student;
import com.anton.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is Added";
    }

    @GetMapping("getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
}
