package com.celcom.day9;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<>(3,2);
		
		System.out.println(vec.size());
		System.out.println(((Vector<Integer>) vec).capacity());
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());//3
		System.out.println(((Vector<Integer>) vec).capacity());//3
		vec.add(40);
		//size is total number of elements but capacity is 5 because the increment we have given is (3,2);
		System.out.println(vec.size());//4
		System.out.println(((Vector<Integer>) vec).capacity());//5
		
		//WAY-1
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
		
		//way-2
		for(Integer i:vec) {
			System.out.println(i);
		}
		
		//way-3
		Enumeration<Integer> e=((Vector<Integer>) vec).elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
