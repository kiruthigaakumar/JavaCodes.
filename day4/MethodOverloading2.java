package com.celcom.day4;

public class MethodOverloading2 {
	
	void addition(int a,int b)
	{
		System.out.println("Integer Addition "+a+b);
	}
	void addition(double a,double b)
	{
		System.out.println("Double Addition "+(a+b));
	}
	void addition(long a,long b)
	{
		System.out.println("Long Addition "+a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading2 m=new MethodOverloading2();
		m.addition(10.0,9.8);
		m.addition(4, 5);
		m.addition(3L,5L);
	}

}
