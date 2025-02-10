package com.celcom.assignments;
import java.util.ArrayList;
class Bank1 {
	String acc;
	double amount;
	Bank1(String acc,double amount)
	{
		this.acc=acc;
		this.amount=amount;
	}
	public String getAcc() 
	{
		return acc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	public String toString() {
		return "account: "+acc+ "amount: "+amount;
	}
}
class Management{
	ArrayList<Bank1> banks;
   Management()
	{
		banks=new ArrayList<>();
	}
   void addBank(Bank1 bank) {
	   banks.add(bank);
	   {
		   System.out.println(bank);
	   }
   }
   public boolean deposit(String acc,double money)
	{
		for(Bank1 bank:banks)
		{
		if(bank.getAcc().equals(acc))
		{
			double prev=bank.getAmount();
			 bank.setAmount(prev+money);
			 return true;
		}
		}
		System.out.println("Account is not exisiting ");
		return false;
	}
   public boolean withdrawal(String acc,double money)
	{
		for(Bank1 bank:banks)
		{
		if(bank.getAcc().equals(acc))
		{
			double prev=bank.getAmount();
			 bank.setAmount(prev-money);
			 return true;
		}
		}
		System.out.println("Account is not exisiting ");
		return false;
	}
   public boolean display(String acc)
   {
	   for(Bank1 bank:banks)
		{
		if(bank.getAcc().equals(acc))
		{
			double prev=bank.getAmount();
			System.out.println(prev);
			return true;
		}
		}
		System.out.println("Account is not exisiting ");
		return false;
   }
	
}
public class Bank{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 b=new Bank1("kiru",100000);
		Bank1 b1=new Bank1("enjen",100);
		Management m=new Management();
		m.addBank(b);
		m.addBank(b1);
		m.display("kiru");
		m.deposit("kiru", 200);
		m.display("kiru");
		m.withdrawal("enjen", 50);
		m.display("enjen");
	}

}
