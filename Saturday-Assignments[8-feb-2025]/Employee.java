package com.celcom.assignments;

public class Employee {
	private String ename;
	private String ejob;
	private double esalary;
	public Employee(String ename,String ejob,double esalary)
	{
		this.ename=ename;
		this.ejob=ejob;
		this.esalary=esalary;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEjob()
	{
		return ejob;
	}
	public void setEjob(String ejob)
	{
		this.ejob=ejob;
	}
	public double getEsalary()
	{
		return esalary;
	}
	public void setEsalary(double esalary)
	{
		this.esalary=esalary;
	}
	public void hike(double percentage)
	{
		double amount=esalary*(percentage/100);
		esalary+=amount;
	}
	public void display()
	{
		System.out.println("The salary is "+esalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("kiruthigaa","sde",100000);
		e.display();
		e.hike(25);
		e.display();
	}

}
