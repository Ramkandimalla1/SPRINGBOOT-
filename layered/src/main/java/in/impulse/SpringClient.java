package in.impulse;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.impulse.config.ApplicationConfig;
import in.impulse.controller.EmployeeController;
import in.impulse.dtos.Employee;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Activating the Container
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
				
	    //Setting as some data for inserting record into employee table
		Employee emp = new Employee();
		emp.setEmpId(new Random().nextInt(9000));
		emp.setEname("Sarath");
		emp.setEmail("sarthimpulseschools@gmail.com");
		emp.setCreateDate(LocalDate.now());
		emp.setCreatedBy("Sarath");
		
		//Requesting the controller bean
		EmployeeController ec = context.getBean(EmployeeController.class);
		//calling the method from Controller class
		ec.addNewEmployee(emp);
		System.out.println("******************************************");
		//calling the method for Controller class
		ec.getAllEmployeeInformation();
	}
}
