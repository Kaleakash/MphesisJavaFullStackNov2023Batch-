package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didn't store";
		}
	}
	
	public String updateEmployee(Employee employee) {
		if(employeeDao.updateEmployee(employee)>0) {
			return "Employee record updated successfully";
		}else {
			return "Employee record didn't update";
		}
	}
	
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmployee(id)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Employee record didn't delete";
		}
	}
	
	public List<Map<String, Object>> findEmployeeInMapFormat() {
		return employeeDao.findEmployee();
	}
	
	public List<Employee> findEmployeeInListFormat() {
		return employeeDao.findEmployeeByRowMapper();
	}
}


