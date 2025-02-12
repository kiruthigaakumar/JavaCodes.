package com.celcom.day7;

class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Thread is Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new MyThread1());
		System.out.println(t2.getState());
		t2.setName("T1");
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		
		t2.start();
		
			Thread.sleep(3000);
		
		System.out.println("Main End");
		
		t2.suspend();
		System.out.println(t2.getState());
		t2.resume();
	}
}
