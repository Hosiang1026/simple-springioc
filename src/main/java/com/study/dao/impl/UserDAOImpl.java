package com.study.dao.impl;


import com.study.dao.UserDAO;
import com.study.model.User;

public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user saved!");
	}

	public void detele() {
		System.out.println("user delete!");
	}

}
