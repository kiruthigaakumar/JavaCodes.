package com.celcom.assignments;
class Animal{
	void makeSound()
	{
		System.out.println("Animals make sound");
	}
}
class Cat extends Animal{
	void makeSound()
	{
		System.out.println("bark");
	}
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Cat();
		a.makeSound();
	}

}
