package com.celcom.day4;

class SuperClass{
	void myMethod()
	{
		System.out.println("Iam from superclass");
	}
}
class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("Iam from subclass");
	}
	
}
public class MethodOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj=new SubClass();
		obj.myMethod();
	}

}
