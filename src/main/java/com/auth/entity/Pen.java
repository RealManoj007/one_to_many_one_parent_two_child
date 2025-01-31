package com.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Pen {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int pid;

    private String penName;

    @JsonIgnore
    @OneToOne(mappedBy = "pen", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Mobile penMob;
    @JsonIgnore
    @OneToOne(  mappedBy = "pen", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Emp penEmp;

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public Mobile getPenMob() {
        return penMob;
    }

    public void setPenMob(Mobile penMob) {
        this.penMob = penMob;
    }

    public Emp getPenEmp() {
        return penEmp;
    }

    public void setPenEmp(Emp penEmp) {
        this.penEmp = penEmp;
    }
}
