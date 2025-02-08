package com.celcom.assignments;

public class Person {
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Person name is "+name);
		System.out.println("Person age is "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("kiruthigaa",21);
		p.display();
	}

}
