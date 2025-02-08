package com.celcom.assignments;

public class Circle {
    int radius;
    Circle(int radius)
    {
    	this.radius=radius;
    }
    void area()
    {
    	System.out.println("The area is "+(3.14*radius*radius));
    }
    void circumference()
    {
    	System.out.println("The perimeter is "+(2*3.14*radius));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(4);
		c.area();
		c.circumference();
	}

}
