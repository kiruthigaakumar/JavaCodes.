package com.celcom.assignments;

public class Dog {
	public String name;
	String breed;
	
	Dog()
	{
		name="happy";
		breed="black";
	}
	void display1() {
		System.out.println("The Dog name is "+name);
		System.out.println("The Dog breed is "+breed);
		
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setBreed(String breed)
	{
		this.breed=breed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display1();
		d.setName("harmonie");
		d.setBreed("white");
		d.display1();
	}

}
