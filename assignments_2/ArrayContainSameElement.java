package com.celcom.assignments_2;

import java.util.Arrays;

public class ArrayContainSameElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array1= {1,2,3,45};
		int []array2= {3,54,6,7};
		if(array1.length!=array2.length)
		{
			System.out.println("not equal");
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(array1.equals(array2)) {
			System.out.println("It is equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
	}

}
