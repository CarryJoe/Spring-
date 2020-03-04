package com.atguigu.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.book.dao.BookDao;
import com.atguigu.book.exception.MyException;
import com.atguigu.book.service.BookService;

@Service
@Transactional  //可以加方法上  也可以加在类上
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao dao;
	/*
	 *@Transactional: 对方法中所有操作作为一个事务进行管理
	 *在方法上只对方法有效果 
	 *在类上对所有的方法都有效果
	 *
	 *propagation(传播)：A方法和B方法都有事务，当A在调用B时，会将A中的事务传播给B方法，B方法对于事务的处理方式就是事务的传播行为
	 *@Transactional(propagation=Propagation.REQUIRED) 必须使用调用者的事务
	 *@Transactional(propagation=Propagation.REQUIRES_NEW)  不使用调用者的事务
	 *isolation:事务的隔离级别，在并发的情况下，操作数据的一种规定 
	 *          读未提交：脏读、读到一些没有意义的数据1  （针对字段）
	 *          读已提交：不可重复读2    （针对字段）
	 *          可重复读：当前正在读的操作不允许其他操作  幻读4（针对行）
	 *          串行化：单线程  性能低 消耗大8
	 *          
	 *timeout:在事务强制回滚前最多可以执行(等待)的时间
	 *        
	 * readOnly:指定当前事务中一系列的操作是否为只读
	 * 若设置为只读，不管事务中有没有写的操作，MYSQL就会在请求访问数据的时候，不加锁，提高性能         
	 * 但如果有写操作的情况，建议一定不能设置只读所以  readOnly不能乱加
	 * 
	 * rollbackFor||rollbackClassName||noRollbackFor||noRollbackForClassName
	 * rollbackFor：因...而回滚  rollbackFor={NullPointerException.class,MyException.class}  表示原因
	 * norollbackFor:不因...而回滚
	 * rollbackClassName：异常的权限定性 
	 * 
	 * */
	
	//必须使用调用者的事务
//	@Transactional(propagation=Propagation.REQUIRED)
	
	//将调用者的事务挂起   不使用调用者的事务   timeout=3表示3秒内没完成事务的话  将强制回滚
	@Transactional(propagation=Propagation.REQUIRES_NEW,timeout=3,rollbackFor={NullPointerException.class,MyException.class})
	public void buyBook(String bid, String uid) {
		// TODO Auto-generated method stub
		
		/*   测试超时情况
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
