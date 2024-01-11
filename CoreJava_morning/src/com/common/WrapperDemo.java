package com.common;

class Student
{
	public void show()
	{
	}
}

public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);
		System.out.println("Autoboxing is.. "+i1);
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is.. "+i2);
		int b=i1.intValue();//unboxing
		System.out.println("Unboxing is.. "+b);
		String s="786";
		int x=Integer.parseInt(s);
		System.out.println("Unboxing is.. "+x);
		Object o1=new Object();
		Student s1=new Student();
		
	}

}
