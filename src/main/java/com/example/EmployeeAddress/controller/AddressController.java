package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addService;

    @GetMapping(value = "/getAllAddress")
    public List<Address> getAll(){
        return addService.getAllAddress();
    }


    @PostMapping(value = "/addAddress")
    public void addAddress(@RequestBody Address address){
        addService.addAddress(address);
    }

    @PutMapping(value = "/updateAddress/{id}/{city}")
    public void updateAddress(@PathVariable Long id,@PathVariable String city){
        addService.updateAddress(id,city);
    }

    @DeleteMapping(value = "/deleteAdd/{id}")
    public void deleteAddressById(@PathVariable Long id){
        addService.deleteAddressById(id);
    }
}
