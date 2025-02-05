package com.celcom.day2;

public class Method {
	void m1()
	{
		System.out.println("Instance method");
	}
	static void m2()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m=new Method();
		m.m1();
		m.m2();
	}

}
