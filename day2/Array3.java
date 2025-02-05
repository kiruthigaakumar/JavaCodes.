package com.celcom.day2;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		System.out.println("intial value");
		for(int value:arr)
		{
			System.out.println(value);
		}
		Scanner sc=new Scanner(System.in);
		System .out.println("Enter the 5 values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0,evenCount=0,oddCount=0;
		for(int value:arr)
		{
			if(value%2==0)
			{
				evenCount+=value;
			}
			else
			{
				oddCount+=value;
			}
			sum+=value;
		}
		System.out.println("sum "+sum);
		System.out.println("evenCount is "+evenCount);
		System.out.println("oddCount is 1"+oddCount);
	}

}
