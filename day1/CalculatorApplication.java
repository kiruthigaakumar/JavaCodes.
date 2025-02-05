package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int l;
		do {
		
		System.out.println("Enter any number 1 for add,2 for sub,3 for multiply,4 for divide,5 for modulus");
		int choice=sc.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
		case 5:
			System.out.println(n1%n2);
			break;
		default:
			System.out.println("errror");
		}
		System.out.println("if want to continue press 1 else 0");
		l=sc.nextInt();
		}
		while(l==1);
			
	}

}
