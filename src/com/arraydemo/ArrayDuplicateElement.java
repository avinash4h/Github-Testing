package com.arraydemo;

public class ArrayDuplicateElement {

	public static void main(String[] args) {
	
		int arr[]=new int[] {1,2,1,3,2,4,5,1};
		System.out.println("Duplicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
