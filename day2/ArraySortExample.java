package com.celcom.day2;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {10,04,284};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("min is "+ arr[0]);
		System.out.println("max is "+ arr[arr.length-1]);
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);	
		}
	}

}
