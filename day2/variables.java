package com.celcom.day2;

public class variables {
	int b=20;//instance variable or object variable
	static int c=30;//static or clas variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//local variable
		System.out.println(a);
		variables v=new variables();
		variables v1=new variables();
		System.out.println(v.b);
		v.b=10;
		System.out.println(v.b+" hi");
		System.out.println(v1.b);
		variables s1=new variables();
		variables s2=new variables();
		System.out.println(s1.c);
		System.out.println(s2.c);
		s1.c=10;//it will also reflects s2
		System.out.println(s1.c);
		System.out.println(s2.c);
	}

}
