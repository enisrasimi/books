package com.example.springapi.Services;

import com.example.springapi.Entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findByNameEndsWith(String name);
}
