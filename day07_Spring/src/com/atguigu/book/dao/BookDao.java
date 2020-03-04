package com.atguigu.book.dao;

public interface BookDao {
	int selectPrice(String bid);
	void updateStock(String bid);
	void updateBalance(String uid,Integer price); 
	
}
