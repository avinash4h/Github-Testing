package com.arraydemo;

public class ArrayAscending {

	public static void main(String[] args) {

		 int arr[]=new int[] {5,3,6,8,4};
		 
		 System.out.println("original array is");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 
		 System.out.println("Displaying array in ascending order");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	}

}
