package com.celcom.day3;

public class ThisKeyword {
	
	String name;
	
	ThisKeyword(){
		this("kiruthigaa");
	}
	ThisKeyword(String name){
		this.name=name;
		this.greeting();
	}
	void greeting()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword t=new ThisKeyword();
		//t.greeting();
	}

}
