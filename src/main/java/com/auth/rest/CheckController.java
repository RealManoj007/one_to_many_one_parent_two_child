package com.auth.rest;

import com.auth.entity.Emp;
import com.auth.entity.Mobile;
import com.auth.entity.Address;
import com.auth.repo.AddressRepo;
import com.auth.repo.EmpRepo;
import com.auth.repo.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @Autowired
    EmpRepo empRepo;

    @Autowired
    MobileRepo mobileRepo;

    @Autowired
    AddressRepo penRepo;

    @PostMapping("/emp")
    public Emp savePen(@RequestBody Emp emp) {
        for (Mobile mobile : emp.getMobiles()) {
            mobile.setEmp(emp);
        }
        for (Address address : emp.getAddress()) {
            address.setEmp(emp);
        }
        return empRepo.save(emp);
    }

}
