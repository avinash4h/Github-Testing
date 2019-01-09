package com.arraydemo;

// Program to rotate array element left
public class ArrayLeftRotate {

	public static void main(String[] args) {

		int arr[]=new int[] {1,2,3,4};
		
		System.out.println("display original array");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// nuber of times to rotate left
		int n=2;
		
		for(int i=1;i<=n;i++)
		{
			int j ,first;
			first=arr[0];
			
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
