package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Citizens;
@Repository
public interface CitizensRepository extends JpaRepository<Citizens, Long>{

	
	@Query("select c from Citizens c where c.emailid=:emailid")
	public Citizens findCitizenByEmailId(@Param("emailid") String emailid);
}
