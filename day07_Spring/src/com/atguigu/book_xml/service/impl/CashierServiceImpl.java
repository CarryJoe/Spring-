
package com.atguigu.book_xml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.book_xml.service.BookService;
import com.atguigu.book_xml.service.Cashier;

@Service
@Transactional
public class CashierServiceImpl implements Cashier{

	@Autowired
	private BookService service;
	
	
	//用户买了两本书，但余额只够买一本  ，是买呢 还是不买？
	@Override
	public void checkOut(String uid, List<String> bids) {
		// TODO Auto-generated method stub
		for(String bid:bids){
			service.buyBook(bid, uid);
		}
		
	}

}
