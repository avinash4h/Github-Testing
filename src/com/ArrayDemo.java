package com;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDemo {

	public static void main(String[] args) {
		


		int a[]=new int[] {2,1,4,5,8,9};
		
		int ln=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>ln)
			{
				sl=ln;
				ln=a[i];
			}
			else if(a[i]>sl && a[i]!=ln)
			{
				sl=a[i];
			}
		}
		System.out.println(sl);
	}

}
