package com.prak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prak.Entity.Customer;
import com.prak.Repo.Curdrepo;

@SpringBootApplication
public class BmicalculatorApplication implements CommandLineRunner {

	@Autowired
	private Curdrepo emp;
	public static void main(String[] args) {
		SpringApplication.run(BmicalculatorApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer e=new Customer();
		e.setId(45);
		e.setName("ram");
		
		emp.save(e);
		
	}

}
