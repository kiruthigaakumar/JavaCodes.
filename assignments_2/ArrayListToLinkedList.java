package com.celcom.assignments_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter the numbers or print exit to terminate");
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
				System.out.println("The number is not valid");
			}
		}
		  LinkedList<Integer> linkedList = new LinkedList<>(l);

	        // Printing LinkedList
	        System.out.println("LinkedList: " + linkedList);
		
	
	}

}
