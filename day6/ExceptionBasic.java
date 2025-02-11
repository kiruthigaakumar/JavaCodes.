package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionBasic {
	static void m1() throws FileNotFoundException {
		FileReader r = new FileReader("abc.txt");
	}

	static void m2() {
		try {
		m1();
		}
		catch(FileNotFoundException e)
		{
			System.out.print(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10/0;
		try {
		throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		}
	}


