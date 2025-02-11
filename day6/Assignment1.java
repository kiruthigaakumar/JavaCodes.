package com.celcom.day6;

//duplicates exception
class DuplicateException extends Exception{
	@Override
	public String toString() {
		return "duplicates";
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,3,4,5,67,8,9,20,10,9};
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length&&i!=j;j++)
			{
				if(arr[i]!=arr[j])
				{
					continue;
				}
				else {
					try {
				throw new DuplicateException();
					}
				catch(DuplicateException e)
					{
					System.out.println(arr[i]);
					System.out.println(e);
					}
				}
			}
		}
	}

}
