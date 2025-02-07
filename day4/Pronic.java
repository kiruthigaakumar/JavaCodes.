package com.celcom.day4;
import java.util.*;
public class Pronic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		for(int i=1;i<=(n/2)+1;i++)
		{
			if(i*(i+1)==n)
			{
				System.out.println("Pronic Number "+ n);
				f=1;
				break;
				
			}
		}
			if(f==0)
			{
				System.out.println("Not a Pronic Number");
			}

	}

}
