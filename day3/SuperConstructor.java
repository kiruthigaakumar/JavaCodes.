package com.celcom.day3;


	class Vehicle1{
		String name="kiru";
		void noOfEngine() {
			System.out.println("I have one engine");
		}
	}
	class TwoWheeler1 extends Vehicle1{
		void noOfWheels()
		{
			System.out.println("I have one wheels");
		}
	}
	class Bike1 extends TwoWheeler1{
		void brand()
		{
			System.out.println("pulser");
		}
	}
	class Car1 extends TwoWheeler1{
		void brand()
		{
			super.noOfEngine();
			System.out.println("kia");
			System.out.println(super.name);
			
		}
	}
	public class SuperConstructor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vehicle1 v=new Vehicle1();
			v.noOfEngine();
			TwoWheeler1 t=new TwoWheeler1();
			t.noOfWheels();
			Car1 c=new Car1();
			c.noOfWheels();
			c.brand();
		}

	}


