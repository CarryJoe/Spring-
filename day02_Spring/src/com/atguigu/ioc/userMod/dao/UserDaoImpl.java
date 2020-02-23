package com.atguigu.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	public UserDaoImpl() {
//		 System.out.println("UserDaoImpl");
	}
	
	
	@Override
	public void addUser() {
		System.out.println("Ìí¼Ó³É¹¦");
	}
   
}
