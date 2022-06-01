package com.acadmaster.springRest.controller;

import com.acadmaster.springRest.entity.Student;
import com.acadmaster.springRest.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    private studentService service;

    @PostMapping(value = "/")
    private Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @PutMapping(value = "/{id}")
    private Student updateStudent(@PathVariable int id, @RequestBody Student student){
        return service.updateStudent(id,student);
    }

    @GetMapping(value = "/{id}")
    private Student getStudent(@PathVariable int id){
        return service.getStudent(id);
    }

    @DeleteMapping(value = "/{id}")
    private void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }

    @GetMapping(value = "/all")
    private List<Student> getAllStudent(){
        return service.getAllStudent();
    }
}
