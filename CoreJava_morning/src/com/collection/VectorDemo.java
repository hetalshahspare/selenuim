package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector(2,1);
		System.out.println("Default size is.. "+v1.size());
		System.out.println("Default value is.. "+v1);
		System.out.println("Default Capacity is.. "+v1.capacity());
		v1.add(123);
		v1.addElement("Hetal");
		v1.add(78.65f);
		v1.addElement(new Integer(100));
		v1.add('H');
		v1.add("Hetal");
		System.out.println("Now size is.. "+v1.size());
		System.out.println("Now Value is.. "+v1);
		System.out.println("Now Capacity is.. "+v1.capacity());
		v1.removeElementAt(2);
		System.out.println("Now size is.. "+v1.size());
		System.out.println("Now Value is.. "+v1);
		System.out.println("Now Capacity is.. "+v1.capacity());
		v1.remove("Rahul");
		System.out.println("Now size is.. "+v1.size());
		System.out.println("Now Value is.. "+v1);
		System.out.println("Now Capacity is.. "+v1.capacity());
		Iterator i1=v1.iterator();
		while(i1.hasNext());
		{
			System.out.println(i1.next());
		}
		
	}

}
