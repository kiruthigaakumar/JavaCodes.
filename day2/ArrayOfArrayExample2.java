package com.celcom.day2;

public class ArrayOfArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[2][];
		arr[0]=new int[] {1,2};
		arr[1]=new int[] {1,2,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
