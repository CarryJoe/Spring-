package com.atguigu.book_xml.dao;

public interface BookDao {
	int selectPrice(String bid);
	void updateStock(String bid);
	void updateBalance(String uid,Integer price); 
	
}
