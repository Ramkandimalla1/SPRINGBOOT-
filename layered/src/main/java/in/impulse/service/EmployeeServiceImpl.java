package in.impulse.service;
import java.util.*;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.impulse.dao.EmployeeDao;
import in.impulse.dtos.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

    @Override
	public boolean createNewEmployee(Employee emp) 
    {
		//calling from Service to Dao Class
		return employeeDao.createEmployee(emp);
	}
	

	@Override
    public void retrieveAllEmployees()
	{
		List<Map<String, Object>> allEmployees = employeeDao.getAllEmployees();
		System.out.println("List::::" + allEmployees);
		
		allEmployees.stream().forEach(eachMap ->{
			eachMap.entrySet().stream().forEach(eachEntry -> {
				System.out.print(eachEntry.getKey() +"----->"+ eachEntry.getValue());
			});
			System.out.println();
		});
	}

}
