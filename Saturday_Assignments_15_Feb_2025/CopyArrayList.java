package com.celcom.Saturday_Assignments_15_Feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> original=new ArrayList<>();
		System.out.println("Enter the numbers or type exit for terminate");
		while(true) {
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			else
			{
				int number=Integer.parseInt(s);
				original.add(number);
			}
		}
		List<Integer> duplicate=new ArrayList<>(original);
		System.out.println("The copied arraylist is");
		System.out.println(duplicate);
	}

}
