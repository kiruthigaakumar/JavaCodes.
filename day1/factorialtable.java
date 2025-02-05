package com.celcom.day1;

import java.util.Scanner;

public class factorialtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        
		        
		        for(int j=1;j<=num;j++)
		        {
		        	long factorial = 1;
		        for (int i = 1; i <= j; i++) {
		            factorial *= i;
		        }
		        
		        System.out.println("Factorial of " + j + " is " + factorial);
		        }
	}

}
