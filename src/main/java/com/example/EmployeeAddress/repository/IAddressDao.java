package com.example.EmployeeAddress.repository;

import com.example.EmployeeAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends JpaRepository<Address, Long> {
    @Modifying
    @Query(value = "update address set city= :city where id= :id ",nativeQuery = true)
    public void updateAddress(Long id, String city);
}
