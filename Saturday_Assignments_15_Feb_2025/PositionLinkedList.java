package com.celcom.Saturday_Assignments_15_Feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PositionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new LinkedList<>();
		System.out.println("Enter the number or type exit to terminate the program");
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
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i) +" "+i);
		}
	}

}
