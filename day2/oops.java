package com.celcom.day2;

class Employee{
	int eid;
	String ename;
	double esalary;
	Employee(int id,String name,double salary)
	{
		eid=id;
		ename=name;
		esalary=salary;
	}
	void display() {
		System.out.println("Employee id "+eid);
		System.out.println("Employee name "+ename);
		System.out.println("Employee salary "+esalary);
	}
}
public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1,"kiru",100000000);
		e.display();
		Employee k=new Employee(1,"kiru",100000000);
		k.display();

	}

}
