package com.auth;

import com.auth.entity.Emp;
import com.auth.entity.Mobile;
import com.auth.entity.Pen;
import com.auth.repo.EmpRepo;
import com.auth.repo.MobileRepo;
import com.auth.repo.PenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPractiseApplication  implements CommandLineRunner {

	@Autowired
	EmpRepo empRepo;

	@Autowired
	MobileRepo mobileRepo;

	@Autowired
	PenRepo penRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaPractiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pen pen=new Pen();
		pen.setPenName("QA");


		Emp emp=new Emp();
		emp.setEmpName("CQA");
		emp.setPen(pen);

		Mobile mob=new Mobile();
		mob.setMobileName("XWE");
		mob.setPen(pen);
		mob.setEmp(emp);

//		pen.setPenEmp(emp);
//		pen.setPenMob(mob);
		penRepo.save(pen);
//		empRepo.save(emp);
//		mobileRepo.save(mob);


	}
}
