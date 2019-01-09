package com.arraydemo;

// Program to find frequency of each element in array

public class ArrayFreq {

	public static void main(String[] args) {

		int arr1[]=new int[] {1,2,4,5,1,2,6,2};
		int frq[]=new int[arr1.length];
		int visited=-1;
		
		for(int i=0;i<arr1.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count++;
					frq[j]=visited;
				}
			}
			
			
			if(frq[i]!=visited)
			{
				frq[i]=count;
			}
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			if(frq[i]!=visited)
			{
				System.out.println(arr1[i] + " | "+ frq[i]);
			}
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(frq[i]+" ");
		}
	}

}
