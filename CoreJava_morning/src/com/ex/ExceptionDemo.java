package com.ex;
import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		

{
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. 1 : " );
		int a=sc.nextInt();
		System.out.println("Enter no. 2 : " );
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Division is.. "+c);
		System.out.println("Your program is completed...");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		//System.out.println(e);
	}
	finally
	{
		System.out.println("This program is Developed by : ");
		System.out.println("Hetal Shah...");
		System.out.println("Mo: 8200610960");
	}
}
}
}