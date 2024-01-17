package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByNameContaining(String name);
    List<Employee> findByOrderBySalaryDesc();
    List<Employee> findByOrderBySalaryAsc();
    List<Employee> findBySalaryBetween(double form,double to);

}
