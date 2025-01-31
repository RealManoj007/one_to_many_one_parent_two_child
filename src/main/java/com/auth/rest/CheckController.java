package com.auth.rest;

import com.auth.entity.Emp;
import com.auth.entity.Mobile;
import com.auth.entity.Pen;
import com.auth.repo.EmpRepo;
import com.auth.repo.MobileRepo;
import com.auth.repo.PenRepo;
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
    PenRepo penRepo;

    @PostMapping("/pen")
    public Object savePen(@RequestBody Pen pen
            , @RequestBody Emp emp
            , @RequestBody Mobile mob
    ) {

        penRepo.save(pen);
        empRepo.save(emp);
        mobileRepo.save(mob);
        return "saved";
    }

}
