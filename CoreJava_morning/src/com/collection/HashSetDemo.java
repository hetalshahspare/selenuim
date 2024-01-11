package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		System.out.println("Default Size is... "+h1.size());
		System.out.println("Defaul value is.. "+h1);
		h1.add("Hetal");
		h1.add(123);
		h1.add('T');
		h1.add(78.65f);
		h1.add(new Integer(100));
		h1.add("Het");
		System.out.println("Now size is.. "+h1.size());
		System.out.println("Now value is.. "+h1);
		h1.remove("Het");
		System.out.println("Now size is.. "+h1.size());
		System.out.println("Now value is.. "+h1);
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
