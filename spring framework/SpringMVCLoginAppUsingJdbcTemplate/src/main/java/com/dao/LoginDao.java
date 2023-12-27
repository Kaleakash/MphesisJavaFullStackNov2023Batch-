package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public class LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int signUp(Login login) {
		try {
	return jdbcTemplate.update("insert into login values(?,?)", login.getEmailid(),login.getPassword());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int signIn(Login login) {
		try {
		List<Map<String, Object>> ll=jdbcTemplate.queryForList("select * from login where emailid=? and password = ?", login.getEmailid(),login.getPassword());
	return 	ll.size();	
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
