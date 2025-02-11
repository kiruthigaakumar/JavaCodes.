package com.celcom.day6;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arithmetic exception int a=10/0;
		// NegativeArraysSize int[] arr=new int[-5];
		// ArrayIndexOutOfBoundsException int arr[]=
		// {10,20,30};System.out.println(arr[3]);
		// NumberFormatException int a=Integer.parseInt("ABC");
		// ClassCastException Exception1 o=(Exception1) new Object();
		System.out.println("Before Exception");

		try {
			int a = 10 / 0;
			//int[] arr=new int[-5];
			System.out.println("hi");//this statement will not exceute onc the error occurrs come to catch block
		} catch (ArithmeticException e) {
			System.out.println(e);
			try {
				int a=Integer.parseInt("HI");
			}catch(NumberFormatException e1)
			{
				System.out.println(e1);
			}
		}catch(NumberFormatException e) {
			System.out.println(e);  
		}catch(NegativeArraySizeException e) {
			System.out.println(e); 
		}
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("After exception");

	}

}
