package com.celcom.assignments;

public class Rectangle {
	int width;
	int height;
	Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	void area()
	{
		System.out.println("The area is "+width*height);
	}
	void perimeter()
	{
		System.out.println("The circumference is "+2*(height*width));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(3,4);
		r.area();
		r.perimeter();
	}

}
