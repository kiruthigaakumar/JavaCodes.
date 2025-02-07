package com.celcom.day4;

class Animal1
{
	String msg= getMessage();
	String getMessage()
	{
		return "a";
	}
}
class Dog extends Animal1
{
	String getMessage()
	{
		return "b";
	}
}
public class MethodOveriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a=new Dog();
		System.out.println(a.msg);
	}

}
