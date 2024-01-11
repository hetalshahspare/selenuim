package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		System.out.println("Default size is.. "+h1.size());
		System.out.println("Default Value is.. "+h1);
		h1.put("Hetal", "Shah");
		h1.put("Bhavesh", "321");
		h1.put("1234", "Het");
		h1.put("Hetal", "Jain");
		System.out.println("Now size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		h1.remove("1234");
		System.out.println("Now size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		Set set=h1.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println("Key is.. "+me.getKey());
			System.out.println("Value is.. "+me.getValue());
			System.out.println();
		}
	}

}
