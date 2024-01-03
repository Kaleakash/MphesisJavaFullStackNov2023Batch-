package com.pems.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pems.entity.Project;
import com.pems.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	// http://localhost:9090/storeProject with method as post 
	
	@RequestMapping(value = "storeProject",method = RequestMethod.POST)
	public String storeProject(HttpServletRequest req, Project project, Model model) {
		
		String pname = req.getParameter("pname");
		project.setPname(pname);
		
		String result = projectService.storeProject(project);
		model.addAttribute("msg", result);
		return "storeProject";
	}
	
}


