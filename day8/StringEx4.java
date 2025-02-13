package com.celcom.day8;

import java.util.Date;
import java.util.Calendar;
public class StringEx4 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}

}
