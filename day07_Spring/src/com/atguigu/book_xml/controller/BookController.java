package com.atguigu.book_xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.book_xml.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	public void buyBook(){
		service.buyBook("1", "1001");
	}
}
