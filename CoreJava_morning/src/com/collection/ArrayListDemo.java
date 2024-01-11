package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is... "+a1.size());
		System.out.println("Default value is..."+a1);
		a1.add(123);
		a1.add(78.65f);
		a1.add('H');
		a1.add(new Integer(100));
		a1.add("Hetal");
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now Value is.. "+a1);
		a1.remove(3);
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now Value is.. "+a1);
		a1.remove("Hetal");
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now Value is.. "+a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
