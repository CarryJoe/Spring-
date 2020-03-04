package com.atguigu.book_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.book_xml.controller.BookController;

public class Test {
	public static void main(String []args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("conf/book_xml.xml");
		BookController controllers=ac.getBean("bookController",BookController.class);
     	controllers.buyBook();
//		controllers.checkOut();
	}
}
