package com.celcom.day3;

public class Mobile {
	int price;
	String brand;
	
	Mobile(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	void display()
	{
		System.out.println("price is "+price);
		System.out.println("brand is "+brand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mobile m=new Mobile(10000,"samsung");
			m.display();		
	}

}
