package com.celcom.day7;

interface Calculator{
	int calc(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=(a,b)->a+b;
		System.out.println(c.calc(10, 29));
		Calculator c1=(a,b)->a-b;
		c1.calc(23,12);
	}

}
