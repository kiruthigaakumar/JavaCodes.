package com.celcom.assignments_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




class Products{
	
	 private List<String> product=new ArrayList<>();
	 
		public List<String> getProduct() {
			return product;
		}
		public void setProduct(List<String> products) {
			this.product.addAll(products);
		}
	}
	class Consumer extends Thread{
		Products product;
		Consumer(Products product){
			this.product=product;
		}
		public void run() {
			synchronized(product) {
				System.out.println("Consumer is waiting ");
				try {
					product.wait();
				}catch(InterruptedException e)
				{
					
				}
				System.out.print("product from producer "+product.getProduct());
			}
		}
	}
	class Producer extends Thread{
		Products product;
		Producer(Products product){
			this.product=product;
		}
		public void run() {
			synchronized(product) {
				System.out.println("Producer produces the item");
				List<String> newProducts = new ArrayList<>();
		        newProducts.add("Product1"); // Example product
		        newProducts.add("Product2"); 
		        newProducts.add("Product3"); 
		        product.setProduct(newProducts); 
				product.notify();
			}
		}

}
public class ProducerConsumer {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Products product=new Products();
		Consumer r=new Consumer(product);
		r.start();
		
		Thread.sleep(2000);
		Producer w=new Producer(product);
		w.start();
	}

}
