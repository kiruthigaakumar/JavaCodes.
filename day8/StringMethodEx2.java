package com.celcom.day8;

public class StringMethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		char ch[]=s1.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		String s2="welcome to trauma world";
		String s3[]=s2.split(" ");
		for(String i:s3)
		{
			System.out.println(i);
		}
		s1.concat(" world");
		System.out.println(s1);//java  .strings are immutable
		s1=s1.concat("world");
		System.out.println(s1);//java world
		
		StringBuffer sb=new StringBuffer("java");
		sb.append("world");
		System.out.println(sb.toString()); 
		
	}

}
