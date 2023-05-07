package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Employee;
import com.example.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    @GetMapping(value = "/getEmployeeById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return empService.getEmployeeById(id);
    }
    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAll(){
        return empService.getAllEmployee();
    }
    @PostMapping(value = "/addEmployees")
    public  void addEmployee(@RequestBody Employee employee){
        empService.addEmployee(employee);
    }

    @PutMapping(value = "/updateEmployee/{id}/{address}")
    public void updateEmployee(@PathVariable Long id,@PathVariable String address){
        empService.updateEmployee(id,address);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        empService.deleteById(id);
    }
}
