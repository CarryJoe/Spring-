package com.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
	private MathImpl mathImpl; // Ŀ����󣨱���Ҫ�нӿڣ� Ӧ����Object��ʱ��MathImpl�������

	public ProxyUtil(MathImpl mathImpl) {
		super();
		this.mathImpl = mathImpl;
	}

	public Object getProxy() { // ������� this ����ǰ��

		// ��ȡ��ǰ���������� �������ش������������
		ClassLoader loader = this.getClass().getClassLoader();

		// ��ȡĿ�������ʵ�ֵ����нӿڵ�Class���� ��������Ŀ����ʵ����ͬ�Ľӿڣ�����ͨ���������ʵ�ֹ���
		Class[] interfaces = mathImpl.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces,
				new InvocationHandler() {

					// invoke����ִ�� ��������и�Ŀ�����ʵ����ͬ�ӿ��������ķ���
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {

						// TODO Auto-generated method stub
						// args������ִ��ʱ�Ĳ��� Object[] args����ľ��ǲ���
						try {
							MyLogger.before(method.getName(),
									Arrays.toString(args));
							Object result = method.invoke(mathImpl, args); // ��̬�������ʵ�ֹ���
							MyLogger.after(method.getName(), result.toString());
						    return result;
						} catch (Exception e) {
							MyLogger.throwing();
							e.printStackTrace(); // ���쳣��Ϣ��ӡ������̨
						}finally{
							System.out.println("�Ķ�����");
						}

						return null;
					}
				});
	}
}
