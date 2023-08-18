package com.prak.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prak.service.bmiservice;

@Controller
public class BMIcontroller {
	
	@Autowired
	bmiservice bmi;
	@GetMapping(path="/")
	public ModelAndView showBMI()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("bmi");
		//mv.addObject("ram", "welcome");
		return mv;
	}
    @PostMapping(path="/")
    public ModelAndView showOutput(int age,double height,double weight)
    {
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("output");
		double re=bmi.cal(height, weight);
		mv.addObject("bmi", re);
    	return mv;
    }
}
