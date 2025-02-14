package com.celcom.day9;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer obj1=new Integer(a);//Boxing
		int b=obj1.intValue();//Un-Boxingbb 
		
		//JDK 1.5
		Integer obj2=a;//Auto-boxing
		int c=obj2;//auto-unboxing
		
	}

}
