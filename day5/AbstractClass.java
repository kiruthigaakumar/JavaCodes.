package com.celcom.day5;
//interface
interface VehiclePlan1{
	public void noOfWheels();//public abstract
	public void noOfEngine();
	public void brandName();  
}
interface VehiclePlan2{
	public void noOfWheels();//public abstract
	public void brandName(); 
}
//abstract class;
abstract class Vehicle implements VehiclePlan1 ,VehiclePlan2{
public void noOfEngine(){
	System.out.println("I have one engine");
}
public abstract void noOfWheels();
public abstract void brandName();
//abstract void brandName(String name); it is possible for overloading.
}

class Car extends Vehicle{
	public void noOfWheels() {
		System.out.println("I have four wheels");
	}
	public void brandName() {
		System.out.println("My brand name benz");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vec=new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();   
	}

}
