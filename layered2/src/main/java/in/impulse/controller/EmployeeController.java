package in.impulse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.impulse.dtos.Employee;
import in.impulse.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public void addNewEmployee(Employee emp) {
		
		boolean insertStatus = employeeService.createNewEmployee(emp);
		
		//checking status
		if(insertStatus) {
			System.out.println("Employee Created Successfilly......");
		}else {
			System.out.println("Employee Not Created.......");
		}
	}
	
	public void getAllEmployeeInformation() {
		employeeService.retrieveAllEmployees();
	}

}
