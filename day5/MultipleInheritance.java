package com.celcom.day5;

interface Interface1{
	int a=10;//by default interface variable public static final
	
}
interface Interface2
{
	int a=20;
	
}
interface Interface3 extends Interface1,Interface2{
	void Addition();
}
class Add implements Interface3{
	public void Addition() {
		System.out.println(Interface1.a);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		a.Addition();
	}

}
