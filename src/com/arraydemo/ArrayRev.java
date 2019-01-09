package com.arraydemo;

public class ArrayRev {

	public static void main(String[] args) {

		int arr[]=new int[] {1,2,3,4,4};
		System.out.println(arr.length);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
