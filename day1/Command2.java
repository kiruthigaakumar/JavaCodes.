package com.celcom.day1;
public class Command2{
	public static void main(String args[]){
		if( args.length ==2){

		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int sum=num1+num2;
		System.out.println("Addition "+num1+num2);
		}
		else{
		System.out.println("Excepting two numbers");
		}
          }

}