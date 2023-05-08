package com.example.EmployeeAddress.service;

import com.example.EmployeeAddress.model.Employee;
import com.example.EmployeeAddress.repository.IEmployeeDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    IEmployeeDao empDao;
    public Optional<Employee> getEmployeeById(Long id) {
        return empDao.findById(id);

    }

    public List<Employee> getAllEmployee() {
        return empDao.findAll();
    }

    public void addEmployee(Employee employee) {
        empDao.save(employee);
    }
    @Transactional
    public void updateEmployee(Long id, String address) {
        empDao.updateEmployee(id , address);

    }

    public void deleteById(Long id) {
        empDao.deleteById(id);
    }
}
