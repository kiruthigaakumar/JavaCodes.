package com.celcom.day3;

public class CallingConstructor {

	CallingConstructor()
	{
		this(4);
		System.out.println("A");
	}
	CallingConstructor(int n)
	{
		this("kiru");
		System.out.println("B");
	}
	CallingConstructor(String s)
	{
		System.out.println("C");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingConstructor c=new CallingConstructor();
	}

}
