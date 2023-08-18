package in.impulse.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.impulse.dtos.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean createEmployee(Employee emp) {
	   int insertCount = jdbcTemplate.update("insert into employee values(?,?,?,?,?)",
				                               new Object[] {emp.getEmpId(),emp.getEname(),emp.getEmail(),
						                       emp.getCreateDate(),emp.getCreatedBy()});
       return insertCount > 0;
		
	}
	@Override
	public List<Map<String, Object>> getAllEmployees()
	{
		List<Map<String, Object>> employees = jdbcTemplate.queryForList("select * from employee");
		return employees;
	}

}

