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

		/*Emp emp = new Emp();
		emp.setEmpName("Manoj");

		Address address = new Address();
		address.setAddress("Pune");

		Address address1 = new Address();
		address1.setAddress("Panhkula");

		Address address2 = new Address();
		address2.setAddress("kalka");

		Address address3 = new Address();
		address3.setAddress("pinjore");


		Mobile mobile = new Mobile();
		mobile.setMobileName("Xiaomi");

		Mobile mobile1 = new Mobile();
		mobile1.setMobileName("Realme");

		Mobile mobile2 = new Mobile();
		mobile2.setMobileName("OnePlus");

		Mobile mobile3 = new Mobile();
		mobile3.setMobileName("XDTDTC");

		address.setEmp(emp);
		address1.setEmp(emp);
		address2.setEmp(emp);
		address3.setEmp(emp);

		mobile.setEmp(emp);
		mobile1.setEmp(emp);
		mobile2.setEmp(emp);
		mobile3.setEmp(emp);

		emp.setMobiles(List.of(mobile, mobile1, mobile2, mobile3));
		emp.setAddress(List.of(address, address1, address2, address3));

		empRepo.save(emp);*/

	}
}
