package com.common;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		
	StringBuffer s1=new StringBuffer("This is Tops Technologies...");
	System.out.println("Length is.. "+s1.length());
	System.out.println("Original is.. "+s1);
	s1.insert(0, "Hii");
	System.out.println("Length is.. "+s1.length());
	System.out.println("Original is.. "+s1);
	s1.append("Hetal");
	System.out.println("Length is.. "+s1.length());
	System.out.println("Original is.. "+s1);
	s1.delete(0, 4);
	System.out.println("Length is.. "+s1.length());
	System.out.println("Original is.. "+s1);
	s1.reverse();
	System.out.println("Length is.. "+s1.length());
	System.out.println("Original is.. "+s1);
	s1.delete(0, 4);
	System.out.println("Length is.. "+s1.length());
	System.out.println("Original is.. "+s1.reverse());
	System.out.println("uppercase  is.. "+s1.toString().toUpperCase());
	}
}
