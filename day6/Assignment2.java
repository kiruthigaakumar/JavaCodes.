package com.celcom.day6;

class VowelException extends Exception{
	@Override
	public String toString()
	{
		return "No Vowels";
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="krthg";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='a'|| s.charAt(i)!='e'|| s.charAt(i)!='i' ||
					s.charAt(i)!='o'||s.charAt(i)!='u')
			{
				try {
					throw new VowelException();
				}
				catch(VowelException v)
				{
					System.out.println(v+" "+s.charAt(i));
				}
			}
		}

	}

}
