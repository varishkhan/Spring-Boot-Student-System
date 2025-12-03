package com.student.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students") // Professional versioning
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 1. GET Request: Fetch all students
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // 2. POST Request: Add a new student
    @PostMapping
    public Student registerNewStudent(@RequestBody Student student) {
        return studentService.addNewStudent(student);
    }

    // 3. DELETE Request: Remove a student
    @DeleteMapping(path = "{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return "✅ Student deleted successfully";
    }
}