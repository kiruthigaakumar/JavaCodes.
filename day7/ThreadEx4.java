package com.celcom.day7;

class TwoTable extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i +" * 2 = "+(i*2));
			try {
				Thread.sleep(2000);
			}catch(InterruptedException t) {}
		}
	}
}
class FiveTable implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.err.println(i +" * 5 = "+(i*5));
			try {
				Thread.sleep(2000);
			}catch(InterruptedException t) {}
		}
	}
}
public class ThreadEx4 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		TwoTable t=new TwoTable();
		Thread f=new Thread(new FiveTable());
		t.start();
		t.join();//the main method is susupended for completion of twotable;
		f.start();

	}

}
