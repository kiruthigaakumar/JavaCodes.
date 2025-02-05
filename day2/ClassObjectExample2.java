package com.celcom.day2;
class Fruits{
	String colour;
	int size;
	int price;
	
	Fruits(String colour,int size,int price)
	{
		this.colour=colour;
		this.size=size;
		this.price=price;
	}
	void display() {
		System.out.println("Fruit color "+colour);
		System.out.println("Fruit size "+size);
		System.out.println("Fruit price "+price);
	}
	void setPrice(int price) {
		this.price=price;
	}
}
public class ClassObjectExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits apple=new Fruits("RED",10,200);
		apple.display();
		apple.setPrice(300);
		apple.display();
		
	}

}
