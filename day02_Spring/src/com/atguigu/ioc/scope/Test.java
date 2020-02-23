package com.atguigu.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		 * 若Spring中有单例模式的bean,初始化容器时就会创建此对象
		 * 而多例原型的bean会在使用时创建
		 * */
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
//		Student s1 = ac.getBean("student", Student.class);
//		System.out.println(s1);
//		
//		Student s2 = ac.getBean("student", Student.class);
//		System.out.println(s2);
		
	}

}
