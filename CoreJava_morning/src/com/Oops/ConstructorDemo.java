package com.Oops;

class Sum
{
	int x,y;
	public Sum() //default
	{
		x=10;
		y=20;
		System.out.println("First sum is.. "+(x+y));
	}
	public Sum(int a) //default
	{
		x=a;
		y=a;
		System.out.println("Second sum is.. "+(x+y));
	}
	public Sum(int a, int b) //default
	{
		x=a;
		y=b;
		System.out.println("Third sum is.. "+(x+y));
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		Sum s1=new Sum();
		new Sum(5);
		Sum s2=new Sum(5,15);
	}
}
