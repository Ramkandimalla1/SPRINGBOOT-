package in.impulse.dao;

import org.springframework.jdbc.core.ResultSetExtractor;  
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.impulse.dtos.Employee;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	
	public boolean createEmployee(Employee emp) {
		
		 MapSqlParameterSource in = new MapSqlParameterSource();
	      in.addValue("id", emp.getEmpId());
	      in.addValue("ename",emp.getEname());
	      in.addValue("email",emp.getEmail());
	      in.addValue("date",emp.getCreateDate());
	      in.addValue("createdby",emp.getCreatedBy());
	   
	      int insertCount = jdbcTemplate.update("insert into employee values(:id,:ename,:email,:date,:createdby)",in);
				                              
	   
	      
       return insertCount > 0;
		
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees = jdbcTemplate.query("select * from employee",new Employeemapper());

		
			  
		 
		return employees;
	}

}

