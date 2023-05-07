package com.example.EmployeeAddress.repository;

import com.example.EmployeeAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Long> {
    @Modifying
    @Query(value = "update employee set address= :address where id= :id ",nativeQuery = true)
    public void updateEmployee(Long id,String address);
}
