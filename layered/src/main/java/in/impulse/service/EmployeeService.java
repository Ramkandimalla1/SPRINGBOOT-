package in.impulse.service;

import in.impulse.dtos.Employee;

public interface EmployeeService {
	
	public boolean createNewEmployee(Employee emp);
	
	public void retrieveAllEmployees();

}