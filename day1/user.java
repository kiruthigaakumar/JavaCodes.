package com.celcom.day1;
import java.util.Scanner;
public class user{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id,name");
		int eid=sc.nextInt();
		String na=sc.next();
		double sa=sc.nextDouble();
		System.out.println(eid+" "+na+" "+sa);
          }

}