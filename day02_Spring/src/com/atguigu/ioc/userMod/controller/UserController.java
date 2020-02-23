package com.atguigu.ioc.userMod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.ioc.userMod.service.UserService;
import com.atguigu.ioc.userMod.service.UserServiceImpl;

/*
 * 基于注解的组件化管理：
 * 
 * 
 * */

//@Controller("aaa")
@Controller
public class UserController {
	
	//自动装配  前提是确保xml文件中至少有一位对应的对象  想让谁装配就给谁装配 byType方式
	//括号里的可以省略  required默认值为true 要求xml文件中必须要有对应的bean否则抛出异常
	//当required值为false时，xml文件可以没有对应的bean 结果返回null
	@Autowired(required=false)    
	private UserService  userService;
	
//	private UserService  userService =new UserServiceImpl(); 
	
	public void addUser(){
		userService.addUser();
	}

	public UserController() {
//	   System.out.println("UserController");	
	}
	

}
