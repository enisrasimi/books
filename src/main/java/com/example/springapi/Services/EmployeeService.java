package com.example.springapi.Services;

import com.example.springapi.Entity.Employee;
import com.example.springapi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements  IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> findByNameEndsWith(String name) {
        var employees = (List<Employee>) employeeRepository.findByNameEndsWith(name);
        return employees;
    }

}
