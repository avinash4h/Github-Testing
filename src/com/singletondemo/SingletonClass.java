package com.singletondemo;

import java.io.Serializable;

public class SingletonClass implements Serializable {
	
	private static SingletonClass single=null;
	
	private SingletonClass()
	{
		System.out.println("instance created");
	}
	
	public static SingletonClass getSingle()
	{
		if(single==null) {
			synchronized (SingletonClass.class) {
			
				if(single==null)
				{
					single=new SingletonClass();
					return single;
				}
			}
			
		}
		return single;
	}

}
