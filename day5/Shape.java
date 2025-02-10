package com.celcom.day5;

import java.util.Scanner;
interface Area{
	void calculateArea();
}
interface Perimeter{
	void calculatePerimeter();
}
abstract class Details1 implements Area,Perimeter
{
	int radius;
	int breadth;
	int length;
	float height;
	public Details1(int radius)
	{
		this.radius=radius;
		
	}
	public Details1(int breadth,int length)
	{
		this.breadth=breadth;
		this.length=length;
	}
	public Details1(int length,float height)
	{
		this.length=length;
		this.height=height;
	}
	public void calculateArea()
	{
		
	}
	public abstract void calculatePerimeter();
}
class Circle extends Details1
{
	
	public Circle(int radius) {
		super(radius);
		
	}
	public void calculatePerimeter(){
		System.out.println(2*3.14*radius);
	}
	public void calculateArea()
	{
		System.out.println(3.1*radius*radius);
	}
}
class Rectangle extends Details1
{

	public Rectangle(int breadth, int length) {
		super( breadth, length);
	}
	public void calculatePerimeter(){
		System.out.println(0.5*(length+breadth));
	}
	public void calculateArea()
	{
		System.out.println(length*breadth);
	}
	
}
class Triangle extends Details1
{

	public Triangle( int length, float height) {
		super( length, height);
	}
	public void calculatePerimeter(){
		System.out.println(0.5*length*height);
	}
	public void calculateArea()
	{
		System.out.println(0.5*length*height);
	}
	
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 for circle,2 for rectangle and 3 for triangle");
		int n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter the radius");
			int radius=sc.nextInt();
			
		Circle detail1=new Circle(radius);
		detail1.calculateArea();
		}
		else if(n==2) {
			
			System.out.println("Enter the length and breadth");
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			Rectangle detail=new Rectangle(length,breadth);
			detail.calculateArea();
		}
		else if(n==3)
		{
			System.out.println("Enter the length and height");
			int length=sc.nextInt();
			float height=sc.nextInt();
			Triangle detail=new Triangle(length,height);
			detail.calculateArea();
			
		}
		
	}

}
