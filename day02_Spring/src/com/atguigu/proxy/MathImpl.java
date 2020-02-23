package com.atguigu.proxy;

public class MathImpl implements MathI {

	@Override
	public int add(int i, int j) {
//		System.out.println("method:add,arguments:"+i+","+j);
		int result=i+j;
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result=i-j;
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int mul(int i, int j) {
		int result=i*j;
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int div(int i, int j) {
		int result=i/j;
		// TODO Auto-generated method stub
		return result;
	}

}
