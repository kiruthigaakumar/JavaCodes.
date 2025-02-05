package com.celcom.day2;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr=new int[] {10,20,30};
			int sum=0;
			System.out.println("Array length "+arr.length);
			System.out.println("Array elements");
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
				System.out.println(arr[i]);
			}
			System.out.println("sum is "+sum);
			for(int value:arr)
			{
				System.out.println(value);
			}
	}

}
