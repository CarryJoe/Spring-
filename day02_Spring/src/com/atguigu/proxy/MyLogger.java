package com.atguigu.proxy;

public class MyLogger {
	public static void before(String methodName, String args) {
		System.out.println("method:" + methodName + ",arguments:" + args);
	}

	public static void after(String methodName, String result) {
		System.out.println("method:" + methodName + ",arguments:" + result);
	}
	public static void throwing(){
		System.out.println("”–“Ï≥£¡À°£°£°£°£°£°£");
	}

}
