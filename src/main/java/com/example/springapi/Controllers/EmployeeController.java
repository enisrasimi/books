package com.example.springapi.Controllers;

import com.example.springapi.Entity.Employee;
import com.example.springapi.Repository.EmployeeRepository;
import com.example.springapi.Services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

//    @GetMapping("/showBooksEndingWith")
//    public String findEmployeesNameEndsWith(Model model, @RequestParam String name) {
//
//        var employees = (List<Employee>) employeeService.findByNameEndsWith(name);
//
//        model.addAttribute("employees", employees);
//
//        return "employees";
//    }

    @GetMapping("employees")
    public  List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }




}
