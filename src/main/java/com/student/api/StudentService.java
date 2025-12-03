package com.student.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Get all students
    public List<Student> getStudents() {
        return repository.findAll();
    }

    // Add a new student (With validation logic)
    public Student addNewStudent(Student student) {
        Optional<Student> studentOptional = repository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("❌ Error: Email already taken!");
        }
        return repository.save(student);
    }

    // Delete student
    public void deleteStudent(Long studentId) {
        boolean exists = repository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("❌ Error: Student with id " + studentId + " does not exist.");
        }
        repository.deleteById(studentId);
    }
}