package com.celcom.day7;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Current Thread Name "+t.getName());
		System.out.println("The Priority is "+t.getPriority());

	}

}
