package com.celcom.day3;
class Details{
	private int eid;
	private String ename;
	private int salary;
	
	public Details(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details d=new Details(10,"kiruthigaa",15355);
	}

}
