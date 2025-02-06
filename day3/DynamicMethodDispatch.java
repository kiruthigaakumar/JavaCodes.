package com.celcom.day3;

class Vehicle{
	
}
class Bike extends Vehicle{
	
}
class Car extends Vehicle{
	
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		Vehicle vec=new Vehicle();//DMD
		vec=new Car();
	}

}
