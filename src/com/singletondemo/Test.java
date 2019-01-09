package com.singletondemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class Test {

	public static void main(String[] args) {

		
		SingletonClass single=SingletonClass.getSingle();
		
		try {
			 ObjectOutput out=new ObjectOutputStream(new FileOutputStream("singlebreak.txt"));
			 out.writeObject(single);
			 out.close();
			 ObjectInput in=new ObjectInputStream(new FileInputStream("singlebreak.txt"));
			 SingletonClass single1=(SingletonClass)in.readObject();
			 in.close();
			
			 System.out.println(single.hashCode());
			 System.out.println(single1.hashCode());
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
