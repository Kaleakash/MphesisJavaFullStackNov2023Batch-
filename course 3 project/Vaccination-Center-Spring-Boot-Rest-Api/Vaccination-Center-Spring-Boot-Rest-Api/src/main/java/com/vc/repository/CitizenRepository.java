package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.entity.Citizens;

@Repository
public interface CitizenRepository extends JpaRepository<Citizens, Integer>{

}
