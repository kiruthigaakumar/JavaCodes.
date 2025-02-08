package com.celcom.assignments;
class Shape1{
	int length;
	int breadth;
	
	void getArea()
	{
		System.out.println("The area");
	}
}
class Rectangle1 extends Shape1{
	Rectangle1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void getArea()
	{
		System.out.println("The area is "+(length*breadth));
	}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 s=new Rectangle1(4,5);
		s.getArea();
	}

}
