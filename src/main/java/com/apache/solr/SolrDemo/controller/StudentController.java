package com.apache.solr.SolrDemo.controller;

import com.apache.solr.SolrDemo.model.Student;
import com.apache.solr.SolrDemo.repo.StudentSolrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentSolrRepository repository;

    @PostMapping("/create/student")
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/student/age/{age}")
    public Student getStudentByAge(@PathVariable("age") Integer age) {
        return repository.findStudentByAge(age);
    }

    @GetMapping("/student/age/between/{age1}/{age2}")
    public List<Student> getStudentBetweenLimits(@PathVariable("age1") Integer age1,
                                                 @PathVariable("age2") Integer age2) {
        return repository.findStudentByAgeBetween(age1, age2);
    }
}