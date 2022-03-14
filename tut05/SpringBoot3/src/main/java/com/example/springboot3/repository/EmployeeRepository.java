package com.example.springboot3.repository;

import com.example.springboot3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //relative search
    List<Employee> findByNameContaining(String name);
}


