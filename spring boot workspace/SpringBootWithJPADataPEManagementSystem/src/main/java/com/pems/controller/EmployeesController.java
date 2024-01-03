package com.pems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pems.entity.Employees;
import com.pems.entity.Project;
import com.pems.service.EmployeesService;
import com.pems.service.ProjectService;

@Controller
public class EmployeesController {

	@Autowired
	EmployeesService employeeService;
	
	
	@Autowired
	ProjectService projectService;
	
	
	@RequestMapping(value = "storeEmployeeInfo",method = RequestMethod.GET)
	public String openstoreEmployee(Employees employee,Model model) {
		
		List<Project> listOfProject = projectService.findAllProjectDetails();
		model.addAttribute("projects", listOfProject);
		
		return "storeEmployee";
		
	}
	
	@RequestMapping(value = "storeEmployeeInDb",method = RequestMethod.POST)
	public String storeEmployee(HttpServletRequest req, Employees employee,Model model) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		int pid = Integer.parseInt(req.getParameter("pid"));
		
		employee.setId(id);
		employee.setName(name);
		employee.setAge(age);
		employee.setPid(pid);
		
		
		String result = employeeService.storeEmployees(employee);
		model.addAttribute("msg", result);
		
		List<Project> listOfProject = projectService.findAllProjectDetails();
		model.addAttribute("projects", listOfProject);
		
		return "storeEmployee";
		
	}
}
