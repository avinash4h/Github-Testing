package com.arraydemo;

public class ArrayLargeElement {

	public static void main(String[] args) {

		int arr[]=new int[] {20,15,25,5};
		int max;
		max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
