package com.celcom.Saturday_Assignments_15_Feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter the numbers or type exit for the termination of the program");
		while(true) {
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			else
			{
				int number=Integer.parseInt(s);
				l.add(number);
			}
		}
		System.out.println("Original list "+l);
		Collections.reverse(l);
		System.out.println("After reversing the list "+l);
	}

}
