package com.pems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pems.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	// we can write custom query JPQL like HQL 
	
	@Query("select p.pname,e.name from Project p, Employees e where p.pid = e.pid")
	public List<Object[]> findEmployeeAndProject();
	
	@Query("select p.pname,e.name from Project p, Employees e where p.pname=:project and p.pid=e.pid")
	public List<Object[]> findEmployeeAndProjectByProject(@Param("project") String project);

}
