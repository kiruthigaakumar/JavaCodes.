package com.celcom.day8;

import java.io.IOException;
import java.io.FileWriter;

import java.io.FileReader;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D://file.txt"); 
		FileWriter fw=new FileWriter("D://file.txt"); 
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("FileCopied");
	}

}
