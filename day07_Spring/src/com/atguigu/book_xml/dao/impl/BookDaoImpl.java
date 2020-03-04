package com.atguigu.book_xml.dao.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atguigu.book_xml.dao.BookDao;
import com.atguigu.book_xml.exception.MyException;

@Repository
public class BookDaoImpl implements BookDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int selectPrice(String bid) {
		String sql="select price from book where bid=?";
		int price=jdbcTemplate.queryForObject(sql, new Object[]{bid},Integer.class);
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void updateStock(String sid) {
		// TODO Auto-generated method stub
		String sql1="select st from stock where sid=?";
		Integer st=jdbcTemplate.queryForObject(sql1, new Object[]{sid},Integer.class);
		if(st<=0){
			throw new RuntimeException();
		}else{
			String sql="update stock set st=st-1 where sid=?";
			jdbcTemplate.update(sql,new Object[]{sid});
		}
		
	}

	@Override
	public void updateBalance(String uid, Integer price) {
		// TODO Auto-generated method stub
		String sql1="select balance from money where uid=?";
		Integer balance=jdbcTemplate.queryForObject(sql1, new Object[]{uid},Integer.class);
		if(balance<price){
			throw new MyException("Óà¶î²»×ã");
		}else
		{
			String sql2="update money set balance=balance-? where uid=?";
			jdbcTemplate.update(sql2,price,uid);
		}
	}




}
