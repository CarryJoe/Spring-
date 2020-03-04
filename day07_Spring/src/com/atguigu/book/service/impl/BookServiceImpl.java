package com.atguigu.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.book.dao.BookDao;
import com.atguigu.book.exception.MyException;
import com.atguigu.book.service.BookService;

@Service
@Transactional  //���Լӷ�����  Ҳ���Լ�������
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao dao;
	/*
	 *@Transactional: �Է��������в�����Ϊһ��������й���
	 *�ڷ�����ֻ�Է�����Ч�� 
	 *�����϶����еķ�������Ч��
	 *
	 *propagation(����)��A������B�����������񣬵�A�ڵ���Bʱ���ὫA�е����񴫲���B������B������������Ĵ���ʽ��������Ĵ�����Ϊ
	 *@Transactional(propagation=Propagation.REQUIRED) ����ʹ�õ����ߵ�����
	 *@Transactional(propagation=Propagation.REQUIRES_NEW)  ��ʹ�õ����ߵ�����
	 *isolation:����ĸ��뼶���ڲ���������£��������ݵ�һ�ֹ涨 
	 *          ��δ�ύ�����������һЩû�����������1  ������ֶΣ�
	 *          �����ύ�������ظ���2    ������ֶΣ�
	 *          ���ظ�������ǰ���ڶ��Ĳ�����������������  �ö�4������У�
	 *          ���л������߳�  ���ܵ� ���Ĵ�8
	 *          
	 *timeout:������ǿ�ƻع�ǰ������ִ��(�ȴ�)��ʱ��
	 *        
	 * readOnly:ָ����ǰ������һϵ�еĲ����Ƿ�Ϊֻ��
	 * ������Ϊֻ����������������û��д�Ĳ�����MYSQL�ͻ�������������ݵ�ʱ�򣬲��������������         
	 * �������д���������������һ����������ֻ������  readOnly�����Ҽ�
	 * 
	 * rollbackFor||rollbackClassName||noRollbackFor||noRollbackForClassName
	 * rollbackFor����...���ع�  rollbackFor={NullPointerException.class,MyException.class}  ��ʾԭ��
	 * norollbackFor:����...���ع�
	 * rollbackClassName���쳣��Ȩ�޶��� 
	 * 
	 * */
	
	//����ʹ�õ����ߵ�����
//	@Transactional(propagation=Propagation.REQUIRED)
	
	//�������ߵ��������   ��ʹ�õ����ߵ�����   timeout=3��ʾ3����û�������Ļ�  ��ǿ�ƻع�
	@Transactional(propagation=Propagation.REQUIRES_NEW,timeout=3,rollbackFor={NullPointerException.class,MyException.class})
	public void buyBook(String bid, String uid) {
		// TODO Auto-generated method stub
		
		/*   ���Գ�ʱ���
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		Integer price =dao.selectPrice(bid);
		
		dao.updateBalance(uid, price);
		
		
		dao.updateStock(bid);
	}

}
