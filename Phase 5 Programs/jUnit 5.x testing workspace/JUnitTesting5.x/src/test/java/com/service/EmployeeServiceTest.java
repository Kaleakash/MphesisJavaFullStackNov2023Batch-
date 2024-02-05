package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bean.Employee;

class EmployeeServiceTest {

	@Test
	@Disabled
	void testEmployeeService() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp = es.getEmployee();
		assertNotNull(emp);		// not equal to null 
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary());
	}

	@Test
	@Disabled
	void testGetAllEmployee() {
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.getAllEmployee();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(0);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary());
	}

	@Test
	@Disabled
	void testUpdateEmployee() {
		EmployeeService es = new EmployeeService();
		Employee emp = new Employee(1, "Mahesh", 15000);
		assertEquals(15000, emp.getSalary());
		
		float updatedSalary = es.updateEmployee(emp);
		
		assertEquals(20000, updatedSalary);
	}

	@Test
	@Disabled
	void testGetEmployeeObject() {
	EmployeeService es = new EmployeeService();
	Employee emp = es.getEmployeeObject(100, "Ravi", 16000);
	assertNotNull(emp);
	}

	@Test
	void testDeleteEmployeeById() {
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmpBeforeDelete = es.getAllEmployee();
		assertEquals(3, listOfEmpBeforeDelete.size());
		
		boolean res1 = es.deleteEmployeeById(1);	// wrong id 
		assertFalse(res1);		
		
		boolean res2 = es.deleteEmployeeById(100);	// correct id 
		assertTrue(res2);
		
		List<Employee> listOfEmpAfterDelete = es.getAllEmployee();
		assertEquals(2, listOfEmpAfterDelete.size());
		
	}

}
