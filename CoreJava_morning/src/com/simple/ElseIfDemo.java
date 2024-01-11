package com.simple;

public class ElseIfDemo 
{
	public static void main(String[] args) 
	{
		int a=100,b=200,c=300;
		if(a>b && b>c)
		{
			System.out.println("A is max..");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is max..");
		}
		else
		{
			System.out.println("C is max..");
		}
	}

}
