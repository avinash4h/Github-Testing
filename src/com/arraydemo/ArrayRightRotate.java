package com.arraydemo;

public class ArrayRightRotate {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		

		int n=2;
		
		for(int i=1;i<=n;i++)
		{
			int j,last;
			last=arr[arr.length-1];
			
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
				
			}
			arr[j]=last;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
