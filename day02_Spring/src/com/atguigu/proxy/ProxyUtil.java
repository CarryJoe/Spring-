package com.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
	private MathImpl mathImpl; // 目标对象（必须要有接口） 应该用Object暂时用MathImpl便于理解

	public ProxyUtil(MathImpl mathImpl) {
		super();
		this.mathImpl = mathImpl;
	}

	public Object getProxy() { // 代理对象 this 代表当前类

		// 获取当前类的类加载器 用来加载代理对象所属类
		ClassLoader loader = this.getClass().getClassLoader();

		// 获取目标对象所实现的所有接口的Class对象， 代理类会和目标类实现相同的接口，最终通过代理对象实现功能
		Class[] interfaces = mathImpl.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces,
				new InvocationHandler() {

					// invoke代表执行 代理对象中跟目标对象实现相同接口所产生的方法
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {

						// TODO Auto-generated method stub
						// args代表方法执行时的参数 Object[] args代表的就是参数
						try {
							MyLogger.before(method.getName(),
									Arrays.toString(args));
							Object result = method.invoke(mathImpl, args); // 动态代理对象实现功能
							MyLogger.after(method.getName(), result.toString());
						    return result;
						} catch (Exception e) {
							MyLogger.throwing();
							e.printStackTrace(); // 将异常信息打印到控制台
						}finally{
							System.out.println("哪都有我");
						}

						return null;
					}
				});
	}
}
