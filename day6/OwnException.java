package com.celcom.day6;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	@Override
	public String toString()
	{
		return "Invalid Age for Voting";
	}
}
public class OwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		int age=new Scanner(System.in).nextInt();
		if(age>18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			try {
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e);
			}
		}
	}

}
