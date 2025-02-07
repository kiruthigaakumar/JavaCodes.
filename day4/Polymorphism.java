package com.celcom.day4;

public class Polymorphism {
	
	void myMethod(int a)
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	void myMethod(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void myMethod(String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p=new Polymorphism();
		p.myMethod(10);
		p.myMethod(5, 21);
		p.myMethod("kiruthigaa");
	}

}
