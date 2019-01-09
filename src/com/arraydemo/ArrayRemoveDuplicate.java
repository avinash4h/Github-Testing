package com.arraydemo;

import java.util.Arrays;

public class ArrayRemoveDuplicate {

	public static void main(String[] args) {

		int arr[]=new int[] {1,2,2,3,4,3,5};
		Arrays.sort(arr);
		
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		
		for(int i=0;i<j;i++)
		{
			System.out.print(temp[i]+ " ");
		}
	}

}
