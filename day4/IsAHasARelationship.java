package com.celcom.day4;

class Vehicle4{
	void engine() {
		System.out.println("All vehicle has a Engine");
	}
	void wheels() {
		System.out.println("All vehicle has a wheel");
	}
}
class Wheels{
	void wheelModel() {
		System.out.println("The wheel Model is MRF");
	}
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have two wheels");
		}
		else if(vehicleType.equals("Three Wheeler")) {
			System.out.println("I have three wheels");
		}
		else if(vehicleType.equals("four Wheeler")) {
			System.out.println("I have four wheels");
		}
		else if(vehicleType.equals("five Wheeler")) {
			System.out.println("I have five wheels");
		}
	}
}
class Engine{
	void engineModel() {
		System.out.println("The engine Model is XYO");
	}
	void noOfEngine() {
		
			System.out.println("I have two engines");
		
	}
}
class car extends Vehicle4{//IS-A
	Wheels wheels=new Wheels();//HAS-A
	Engine engine=new Engine();//HAS-A
	
	void engineModel() {
		engine.engineModel();
	}
	void wheelModel() {
		wheels.wheelModel();
	}
	void noOfWheels()
	{
		wheels.noOfWheels("four Wheeler");
	}
}
public class IsAHasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car car=new car();
		car.engineModel();
		
	}

}
