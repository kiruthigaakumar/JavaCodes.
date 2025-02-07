package com.celcom.day4;
//errors in final
final class Animal3{
	String msg=getMessage();
	final String getMessage()
	{
		return "a";
	}
}
class Rat extends Animal3{
	String getMessage()
	{
		return "b";
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal3 an=new Rat();
		System.out.println(an.msg);
		final int a=10;
	}

}
