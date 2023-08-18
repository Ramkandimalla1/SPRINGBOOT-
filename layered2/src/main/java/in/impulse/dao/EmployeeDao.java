package in.impulse.dao;

import in.impulse.dtos.Employee;
import java.util.*;
public interface EmployeeDao {
	
	    public boolean createEmployee(Employee emp);

        public List<Employee> getAllEmployees();

}
