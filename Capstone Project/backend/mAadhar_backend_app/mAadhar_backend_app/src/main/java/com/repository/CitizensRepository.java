package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Citizens;
@Repository
public interface CitizensRepository extends JpaRepository<Citizens, Long>{

}
