package com.arraydemo;

public class ArrayLinearSearch {

	public static void main(String[] args) {

		int a[]=new int[] {5,6,2,8,1,9,4};
		
		int item=67;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("Item found at index "+a[i]);
				temp=1;
			}
			
		}
		if(temp==0)
		{
			System.out.println("not found");
		}
	}

}
