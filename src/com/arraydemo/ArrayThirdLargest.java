package com.arraydemo;

public class ArrayThirdLargest {

	public static void main(String[] args) {

		int arr[]=new int[] {20,30,40,15,90};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp;
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("third largest number is :"+arr[2]);
					

}
}