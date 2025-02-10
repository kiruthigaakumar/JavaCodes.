package com.celcom.assignments;
class Vehicle1
{
	void drive()
	{
		System.out.println("driving");
	}
}
class Car extends Vehicle1{
	void drive()
	{
		System.out.println("Reparing a car");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v=new Car();
		v.drive();
	}

}
