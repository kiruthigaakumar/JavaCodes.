package com.celcom.day7;

class Resource{
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data=data;
	}
}
class Reader extends Thread{
	Resource resource;
	Reader(Resource resource){
		this.resource=resource;
	}
	public void run() {
		synchronized(resource) {
			System.out.println("Reader is waiting for the writer to write the data");
			try {
				resource.wait();
			}catch(InterruptedException e)
			{
				
			}
			System.out.print("Data from Reader "+resource.getData());
		}
	}
}
class Writer extends Thread{
	Resource resource;
	Writer(Resource resource){
		this.resource=resource;
	}
	public void run() {
		synchronized(resource) {
			System.out.println("writes the data");
			resource.setData("hiii");
			resource.notify();
		}
	}
}
public class ThreadEx5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Resource resource=new Resource();
		Reader r=new Reader(resource);
		r.start();
		
		Thread.sleep(2000);
		Writer w=new Writer(resource);
		w.start();
	}

}
