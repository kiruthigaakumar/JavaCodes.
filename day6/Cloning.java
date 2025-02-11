package com.celcom.day6;

public class Cloning implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cloning obj1=new Cloning();
		System.out.println(obj1.hashCode());
		
		Cloning obj2=(Cloning)obj1.clone();//
		System.out.println(obj2.hashCode());
	}

}
