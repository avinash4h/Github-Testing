package com.arraydemo;

public class ArraySmallElement {

	public static void main(String[] args) {

		int arr[]=new int[] {20,25,5,30,10};
		int min;
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		System.out.println(min);
	}

}
