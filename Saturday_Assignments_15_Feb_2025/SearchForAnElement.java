package com.celcom.Saturday_Assignments_15_Feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchForAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter the integer and type exit to stop");
		while(true) {
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("exit"))
			{
				break;
			}
			try {
				int number=Integer.parseInt(s);
				l.add(number);
			}catch(NumberFormatException e) {
				System.out.println("number is invalid");
			}
		}
		System.out.println("Enter the number which has to be searched");
		int search=sc.nextInt();
		if(l.contains(search)) {
			System.out.println("The number is found");
		}
		else
		{
			System.out.println("The number is not in the arraylist");
		}
	}

}
