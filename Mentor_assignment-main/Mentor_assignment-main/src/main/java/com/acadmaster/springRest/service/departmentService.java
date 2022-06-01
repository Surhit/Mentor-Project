package com.acadmaster.springRest.service;

import com.acadmaster.springRest.entity.Department;
import com.acadmaster.springRest.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

//addDep, deleteDep, updateDep, allStudentinDep
@Service
public class departmentService {

    @Autowired
    public departmentRepository dpr;

    @Transactional
    public Department addDepartment(Department department){
        return dpr.save(department);
    }

    @Transactional
    public  void deleteDepartment(int id){
//        Department dep = dpr.findById(id).get();
        dpr.deleteById(id);
    }

    @Transactional
    public Department updateDepartment(int id, Department dep){
        dep.setDepartmentId(id);
        return dpr.save(dep);
    }

    public List<Department> allDepartment(){
        return dpr.findAll();
    }

    public Department getDepartment(int id){
        return dpr.findById(id).get();
    }


}
