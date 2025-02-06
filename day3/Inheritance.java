package com.celcom.day3;
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels()
	{
		System.out.println("I have one wheels");
	}
}
class Bike extends TwoWheeler{
	void brand()
	{
		System.out.println("pulser");
	}
}
class Car extends TwoWheeler{
	void brand()
	{
		System.out.println("kia");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		v.noOfEngine();
		TwoWheeler t=new TwoWheeler();
		t.noOfWheels();
		Car c=new Car();
		c.noOfWheels();
		c.brand();
	}

}
