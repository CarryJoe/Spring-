package com.atguigu.ioc.datasource;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.ioc.userMod.dao.UserDao;
import com.atguigu.ioc.userMod.dao.UserDaoImpl;

public class Test {
	public static void main(String[] args) throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"datasource.xml");
		DruidDataSource bean = ac.getBean("datasource", DruidDataSource.class);
	    System.out.println(bean.getConnection());
	}

}
