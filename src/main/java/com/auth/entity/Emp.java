package com.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String empName;

    @JsonIgnore
    @OneToOne(mappedBy = "emp",  cascade = CascadeType.ALL)
//    @JoinColumn(referencedColumnName = "mobid")
    private Mobile mobile;

    @OneToOne
    Pen pen;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

//        public Mobile getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(Mobile mobile) {
//        this.mobile = mobile;
//    }
}
