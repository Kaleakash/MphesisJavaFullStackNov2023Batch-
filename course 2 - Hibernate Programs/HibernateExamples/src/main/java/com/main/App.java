package com.main;

import com.utitlity.MenuOption;

/*
 * 
 * 	create table trainer(tid int primary key,tname varchar(30));
create table student(sid int primary key,sname varchar(30), age int, tsid int, foreign key(tsid) references trainer(tid));

 * 
 * 
 */
public class App {

	public static void main(String[] args) {
		
		MenuOption.trainerMenuOption();
	}

}
