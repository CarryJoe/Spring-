package com.atguigu.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.book.service.BookService;
import com.atguigu.book.service.Cashier;

@Controller
public class BookController {
    
	@Autowired
	private BookService bookService;
 
	public void buyBook(){
    	bookService.buyBook("1", "1001");
    }
    
	@Autowired
	private Cashier cashier;
	
	@Autowired
	public void checkOut(){
		List<String> bids=new ArrayList<>();
		bids.add("1");
		bids.add("2");
		cashier.checkOut("1001", bids);
	}
    
}
