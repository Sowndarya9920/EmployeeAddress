package com.example.EmployeeAddress.service;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.repository.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AddressService {
    @Autowired
    IAddressDao addDao;

    public List<Address> getAllAddress() {
        return addDao.findAll();
    }

    public void addAddress(Address address) {
        addDao.save(address);
    }

    @Transactional
    public void updateAddress(Long id, String city) {
        addDao.updateAddress(id,city);
    }

    public void deleteAddressById(Long id) {
        addDao.deleteById(id);
    }
}
