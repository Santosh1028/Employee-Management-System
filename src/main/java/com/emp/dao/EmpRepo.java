package com.emp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entities.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
