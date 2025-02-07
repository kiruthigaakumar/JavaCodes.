package com.celcom.day4;

class Animal{
	int b=10;
	void move() {
		System.out.println("cannot be defined");
	}
	void eat()
	{
		System.out.println("cannot be defined");
	}
}
class Cat extends Animal{
	int b=39;
	void move()
	{
		System.out.println("cat will move by walk");
	}
	void eat()
	{
		System.out.println("cat will eat rat");
	}
}
class Parrot extends Animal{
	void move()
	{
		System.out.println("parrot will move by fly");
	}
	void eat()
	{
		System.out.println("Parrot will eat nuts");
	}
}
class Fish extends Animal{
	void move()
	{
		System.out.println("fish will move by swim");
	}
	void eat()
	{
		System.out.println("fish will eat worm");
	}
}
public class MethodOverridding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal=new Fish();
		animal.move();
		animal.eat();
		animal=new Cat();
		animal.move();
		animal.eat();
		animal=new Parrot();
		animal.eat();
		animal.move();
		
		//based on object && only methods can override not variable;
		Animal ani=new Cat();
		ani.move();
		System.out.println(ani.b);
	}

}
