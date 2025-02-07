package com.celcom.day4;

public class MethodOverloading3 {
	void concat(int a,int b)
	{
		System.out.println("Integer concat "+a+""+b);
	}
	void concat(String a,String b)
	{
		System.out.println("String concat "+a+""+b);
	}
	void concat(float a,float b)
	{
		System.out.println("float concat "+a+""+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading3 mem=new MethodOverloading3();
		mem.concat(3,4);
		mem.concat("kiru", "thigaa");
		mem.concat(1.0f, 2.0f);
	}

}
