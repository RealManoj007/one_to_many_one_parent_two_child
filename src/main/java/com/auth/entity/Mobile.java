package com.auth.entity;

import jakarta.persistence.*;

@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobid;

    private String mobileName;

    @OneToOne
    private Emp emp;

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
