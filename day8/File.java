package com.celcom.day8;

import java.io.FileReader;
import java.io.IOException;
public class File {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C://file.txt"); 
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}

}
