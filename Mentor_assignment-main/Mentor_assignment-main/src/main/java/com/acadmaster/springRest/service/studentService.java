package com.acadmaster.springRest.service;

import com.acadmaster.springRest.entity.Student;
import com.acadmaster.springRest.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//addstudent, deleteStudent, updateStudent, addDeaprtmenttoStudent
@Service
public class studentService {

    @Autowired
    private studentRepository str;
    @Transactional
    public Student addStudent(Student student){
        return str.save(student);
    }
    @Transactional
    public void deleteStudent(Integer id){
        str.deleteById(id);
    }
    @Transactional
    public Student updateStudent(int id, Student student){
        student.setRollNo(id);
        return str.save(student);
    }

    public Student getStudent(int id){
        return str.findById(id).get();
    }
    public List<Student> getAllStudent(){
        return str.findAll();
    }

}
