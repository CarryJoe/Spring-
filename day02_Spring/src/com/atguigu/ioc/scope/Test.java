package com.atguigu.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		 * ��Spring���е���ģʽ��bean,��ʼ������ʱ�ͻᴴ���˶���
		 * ������ԭ�͵�bean����ʹ��ʱ����
		 * */
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
//		Student s1 = ac.getBean("student", Student.class);
//		System.out.println(s1);
//		
//		Student s2 = ac.getBean("student", Student.class);
//		System.out.println(s2);
		
	}

}
