package com.Oops;

class First
{
	public void display()
	{
		System.out.println("This is first class demo");
	}
}
class Second extends First
{
	public void display()
	{
		System.out.println("This is second class demo");
	}
}
public class MethodOveridingDemo 
{
	public static void main(String[] args) 
	{
		Second s1=new Second();
		s1.display();
		
		First f1=new First();
		f1.display();
		f1.toString();
	}

}
