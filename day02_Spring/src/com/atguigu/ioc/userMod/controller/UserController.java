package com.atguigu.ioc.userMod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.ioc.userMod.service.UserService;
import com.atguigu.ioc.userMod.service.UserServiceImpl;

/*
 * ����ע������������
 * 
 * 
 * */

//@Controller("aaa")
@Controller
public class UserController {
	
	//�Զ�װ��  ǰ����ȷ��xml�ļ���������һλ��Ӧ�Ķ���  ����˭װ��͸�˭װ�� byType��ʽ
	//������Ŀ���ʡ��  requiredĬ��ֵΪtrue Ҫ��xml�ļ��б���Ҫ�ж�Ӧ��bean�����׳��쳣
	//��requiredֵΪfalseʱ��xml�ļ�����û�ж�Ӧ��bean �������null
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
