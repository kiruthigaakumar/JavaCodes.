package com.celcom.day4;

class concat
{
	concat(int a,int b)
	{
		this(3.0f,3f);
		System.out.println("Integer concat "+a+""+b);
	}
	concat(String a,String b)
	{
		System.out.println("String concat "+a+""+b);
	}
	concat(float a,float b)
	{
		this("kiru","thigaa");
		System.out.println("float concat "+a+""+b);
	}
}
public class ConstructorOverloading { //one class is enough

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat c=new concat(2,3);
	//	concat c1=new concat(3.0f,3f);
	//	concat c2=new concat("kiru","thigaa");
	}

}
