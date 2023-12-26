package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public int storeEmployee(Employee employee) {
		try {
return jdbcTemplate.update("insert into employee values(?,?,?)", employee.getId(),employee.getName(),employee.getSalary());	
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int updateEmployee(Employee employee) {
		try {
return jdbcTemplate.update("udpate employee set salary = ? where id = ?",employee.getSalary(),employee.getId());	
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteEmployee(int id) {
		try {
return jdbcTemplate.update("delete from employee where id =?", id);	
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
}
