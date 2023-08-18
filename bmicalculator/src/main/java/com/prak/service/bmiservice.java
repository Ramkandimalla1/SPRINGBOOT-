package com.prak.service;

import org.springframework.stereotype.Service;

@Service
public class bmiservice {
	
	public double cal(double height,Double weight)
	{
		
		double r=weight/((height/100)*(height/100));
		System.out.println(r);
		return r;
	}

}
