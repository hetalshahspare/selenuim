package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		System.out.println("Default size is. "+a1.size());
		System.out.println("Default value is.. "+a1);
		
		Student s1=new Student();
		s1.setSno(4321);
		s1.setSname("Hetal");
		s1.setCity("Ank");
		Student s2=new Student();
		s2.setSno(1234);
		s2.setSname("Bhavesh");
		s2.setCity("Baroda");
		Student s3=new Student();
		s3.setSno(123);
		s3.setSname("Het");
		s3.setCity("Navsari");
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now value is.. "+a1);
		Iterator<Student> i1=a1.iterator();
		while(i1.hasNext())
		{
			Student s=i1.next();
			System.out.println("Sno is.. "+s.getSno());
			System.out.println("Sname is.. "+s.getSname());
			System.out.println("City is.. "+s.getCity());
			System.out.println();
		}
		
	}

}
