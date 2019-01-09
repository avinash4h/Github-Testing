package com.arraydemo;

public class ArrayBinarySearch {

	public static void main(String[] args) {

		int a[]=new int [] {1,2,3,6,8,9,11};
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		int item=3;
		while(li<=hi)
		{
			if(a[mi]==item)
			{
				System.out.println("item is at "+mi+" index position");
				break;
			}
			else if(a[mi]<item)
			{
				li=mi-1;
			}else {
				hi=mi+1;
			}
			mi=(li+hi)/2;
			
		}
	}

}
