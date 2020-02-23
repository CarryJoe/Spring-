package com.atguigu.proxy;

public class Test {
	public static void main(String[] args) {

		/*
		 * 自己调用
		 * MathI math=new MathImpl(); 
		 * int result =math.add(1, 1);
		 * System.out.println(result);
		 */
         ProxyUtil proxy=new ProxyUtil(new MathImpl());
         
         MathI math=(MathI)proxy.getProxy();
         int i=math.add(1,1);
         System.out.println(i);
         
         int j=math.div(1,1);
         System.out.println(j);
		 
	}
}
