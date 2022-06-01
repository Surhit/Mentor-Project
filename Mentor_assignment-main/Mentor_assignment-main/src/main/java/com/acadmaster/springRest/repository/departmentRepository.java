package com.acadmaster.springRest.repository;

import com.acadmaster.springRest.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface departmentRepository extends JpaRepository<Department, Integer> {
}
