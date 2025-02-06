package com.celcom.day3;

class A {
A()
{
	this(0);
	System.out.println("A");
}
A(int a)
{
	System.out.println("a 1");
}
}
class B extends A{
	B(){
		
		System.out.println("B");
	}
	B(int b)
	{
		
		System.out.println("B 1");
	
	}
}
class C extends A{
	C(){
		System.out.println("C");
	}
	C(int c)
	{
		super(10);
		System.out.println("C 1");
	
	}
}
public class JvmSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(); 
		B b1=new B(9);
		System.out.println(); 
		C c=new C(8);
		System.out.println(); 
		A a=new A();
		
	}

}
