package com.atguigu.ioc.userMod.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.atguigu.ioc.userMod.dao.UserDao;
import com.atguigu.ioc.userMod.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService{
    public UserServiceImpl(){
//    	 System.out.println("UserServiceImpl");
    }
    
    /**
     * 多个不同的类继承同一个接口userDao,自动生成Bean时会抛出异常，此时我们用 
     * @Qualifier(value="userDaoMybatisImpl")指定生成的对象
     */
    
    @Autowired
    @Qualifier(value="userDaoMybatisImpl")
    private UserDao userDao;
    
//    @Autowired
//    @Qualifier(value="userDaoMybatisImpl")
//    public void ssssetUserDao(UserDao userDao){
//    	this.userDao=userDao;
//    }
    
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		userDao.addUser();
	}
}
