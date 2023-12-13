package com.main;

import com.utitlity.MenuOption;

/*
 * 
 * 	create table trainer(tid int primary key,tname varchar(30));
create table student(sid int primary key,sname varchar(30), age int, tsid int, foreign key(tsid) references trainer(tid));

mysql> insert into student values(1,'Seeta',21,101);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(2,'Reeta',22,101);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(3,'Meeta',23,102);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(4,'Leeta',24,null);
 * 
 * 
 */
public class App {

	public static void main(String[] args) {
		
		MenuOption.trainerMenuOption();
		//MenuOption.studentMenuOption();
	}

}


