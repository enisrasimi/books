package com.example.springapi.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//public interface EmployeeRepository extends CrudRepository<Employee, Long> {
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(
            value = "select * from employee",
            nativeQuery = true
    )
    List<Employee> findByNameEndsWith(String chars);


    @Query(
            value = "select * from employee",
            nativeQuery = true
    )
    public Object[][] findAllEmployesNativeQ(List<String> deptNames);
}
