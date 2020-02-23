package com.atguigu.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor{

	//���ô�����  ��ʼ��ǰ��Ĳ���  Ҳ�Ƕ�bean�Ĳ���
	//Spring������������spring�������ļ�������
	
    //��ʼ��ǰִ��
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		Person person=(Person)bean;
		if(person.getSex().equals("��")){
			person.setName("���޼�");
		}else{
			person.setName("����");
		}
		return person;
	}
	
	//��ʼ����ִ��
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	

}
