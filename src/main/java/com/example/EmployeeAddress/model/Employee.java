package com.example.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="address_id")
    private Address address;

}
