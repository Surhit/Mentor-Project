package com.acadmaster.springRest.controller;


import com.acadmaster.springRest.entity.Department;
import com.acadmaster.springRest.service.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class departmentController {
    @Autowired
    private departmentService service;

    @PostMapping(value = "/")
    private Department addDepartment(@RequestBody Department department){
        return service.addDepartment(department);
    }

    @PutMapping(value = "/{id}")
    private Department updateDepartment(@PathVariable int id, @RequestBody Department department){
        return service.updateDepartment(id,department);
    }

    @GetMapping(value = "/{id}")
    private Department getDepartment(@PathVariable int id){
        return service.getDepartment(id);
    }

    @DeleteMapping(value = "/{id}")
    private void deleteDepartment(@PathVariable int id){
        service.deleteDepartment(id);
    }

    @GetMapping(value = "/all")
    private List<Department> getAllDepartment(){
        return service.allDepartment();
    }
}
