package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String>{

}
