package com.celcom.day7;

class MyThread3 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" My Thread Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadEx3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyThread3());
		t1.setName("T1");
		
		Thread t2=new Thread(new MyThread3());
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}

}
