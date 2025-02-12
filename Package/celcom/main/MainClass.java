package com.celcom.main;

import com.celcom.Pack1.MyClass1;
import com.celcom.Pack2.MyClass2;

import java.lang.Math;
//for importing static property from a class

import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;
public class MainClass {
	static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 obj1=new MyClass1();
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyClass2 obj2=new MyClass2();
		obj2.myMethod3();
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(a);
		int a=parseInt("ABC");
	}

}
