package com.acadmaster.springRest.repository;

import com.acadmaster.springRest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {

}
