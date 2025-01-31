package com.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String empName;

    @OneToOne(mappedBy = "emp")
    private Mobile mobile;

    @OneToMany(mappedBy="emp", cascade = CascadeType.ALL)
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
