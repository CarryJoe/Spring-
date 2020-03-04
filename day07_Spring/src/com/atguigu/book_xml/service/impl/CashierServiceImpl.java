
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
	
	
	//�û����������飬�����ֻ����һ��  �������� ���ǲ���
	@Override
	public void checkOut(String uid, List<String> bids) {
		// TODO Auto-generated method stub
		for(String bid:bids){
			service.buyBook(bid, uid);
		}
		
	}

}
