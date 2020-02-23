package com.atguigu.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor{

	//后置处理器  初始化前后的操作  也是对bean的操作
	//Spring处理器必须在spring的配置文件中申明
	
    //初始化前执行
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		Person person=(Person)bean;
		if(person.getSex().equals("男")){
			person.setName("张无忌");
		}else{
			person.setName("赵敏");
		}
		return person;
	}
	
	//初始化后执行
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	

}
