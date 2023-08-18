package com.prak.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prak.Entity.Customer;
import com.prak.Repo.Curdrepo;

@Service
public class bmiservice {
	
	@Autowired
	   private Curdrepo emp;
	   
	   public Object Details(int id)
	   {
		Optional <Customer> ek=emp.findById(id);
		if(ek.isPresent())
		{
			//Customer rk=ek.get();
			
			System.out.println(ek.get());
		}
		else
		{
			System.out.println("not fount");
		}
		System.out.println(ek);
		
		return ek.get();
		
	   }

}
