package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int eid;
	String ename;
	int esalary;
	
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	} 

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String toString() {
		return "Employee [eid=" + eid +",ename ="+ ename+",esalary="+esalary+"]";
	}
}
public class SerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee e=new Employee(101,"kiruthigaa",1000000);
		FileOutputStream fout=new FileOutputStream("D://ObjectFile.txt");
		
		//converting the normal txt file into object writable file
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		
		objout.writeObject(e);
		objout.close();
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-serailization
		FileInputStream fin=new FileInputStream("D://ObjectFile.txt");
		
		//converting the normal txt file into object writable file
		ObjectInputStream objin=new ObjectInputStream(fin);
		
		Employee emp=(Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		
	}

}
