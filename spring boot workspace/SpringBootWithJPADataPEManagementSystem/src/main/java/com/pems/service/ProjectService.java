package com.pems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pems.entity.Project;
import com.pems.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	public String storeProject(Project project) {
		projectRepository.save(project);	// it is pre-defined method part of jpa repository interface. 
		return "Project details stored successfully";
	}
	
	public List<Project> findAllProjectDetails() {
		return projectRepository.findAll();		// it is pre -defined method. 
	}
	
	public String deleteProject(int pid) {
		if(projectRepository.existsById(pid)) {		// if project details present it return true
			projectRepository.deleteById(pid);
			return "Project details deleted successfully";
		}else {
			return "Project details not present";
		}
	}
	
	public String updateProjectInfo(Project project) {
		if(projectRepository.existsById(project.getPid())) {		// if project details present it return true
			Project p = projectRepository.getById(project.getPid());	// p retrieve from database 
					p.setPname(project.getPname());			// change old name by new name
				projectRepository.saveAndFlush(p);
			return "Project details updated successfully";
		}else {
			return "Project details not present";
		}
	}
	
	public List<Object[]> findProjectAndEmployeeJoin() {
		return projectRepository.findEmployeeAndProject();
	}
	
	public List<Object[]> findProjectAndEmployeeByProject(String project) {
		return projectRepository.findEmployeeAndProjectByProject(project);
	}
}





