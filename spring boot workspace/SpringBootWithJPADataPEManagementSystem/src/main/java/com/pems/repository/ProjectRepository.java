package com.pems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pems.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
}
