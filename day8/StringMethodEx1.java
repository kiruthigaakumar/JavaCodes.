package com.celcom.day8;

public class StringMethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals("JAva"));
		System.out.println(s1.equalsIgnoreCase("JAVA"));
		System.out.println(s1.concat("hii"));
		System.out.println(s1.replace('a','z'));
		System.out.println(s1.contains("av"));
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.endsWith("va"));
		
		String s2="Java World";
		System.out.println(s2.substring(2,6));
		System.out.println(s2.substring(2));
	}

}
