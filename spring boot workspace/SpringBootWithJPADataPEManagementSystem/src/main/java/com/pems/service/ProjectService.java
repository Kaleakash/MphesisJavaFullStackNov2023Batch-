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
}
