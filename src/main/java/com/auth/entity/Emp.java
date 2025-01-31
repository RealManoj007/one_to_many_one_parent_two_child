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

    @OneToMany(mappedBy="emp", cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToMany(mappedBy="emp", cascade = CascadeType.ALL)
    private List<Mobile> mobiles;

    public Emp(){}

    public Emp(List<Address> address, List<Mobile> mobiles) {
        this.address = address;
        this.mobiles = mobiles;
    }

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

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }
}
