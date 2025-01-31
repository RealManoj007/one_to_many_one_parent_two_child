package com.auth;

import com.auth.entity.Emp;
import com.auth.entity.Mobile;
import com.auth.entity.Address;
import com.auth.repo.AddressRepo;
import com.auth.repo.EmpRepo;
import com.auth.repo.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaPractiseApplication  implements CommandLineRunner {

	@Autowired
	EmpRepo empRepo;

	@Autowired
	MobileRepo mobileRepo;

	@Autowired
	AddressRepo addressRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaPractiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Emp emp=new Emp();
		emp.setEmpName("Rahul");

//		Emp emp1=new Emp();
//		emp1.setEmpName("Sanjay");

		Mobile mob=new Mobile();
		mob.setMobileName("Samsung");
		mob.setEmp(emp);

		Address add1 =new Address();
		add1.setAddress("Pune");
		add1.setEmp(emp);

		Address add2 =new Address();
		add2.setAddress("Chandigarh");
		add2.setEmp(emp);

		emp.setAddress(List.of(add1,add2));

		empRepo.save(emp);
		mobileRepo.save(mob);
//		mobileRepo.save(mob);

	}
}
