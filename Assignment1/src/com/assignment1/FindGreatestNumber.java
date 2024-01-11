package com.assignment1;

import java.util.Scanner;

public class FindGreatestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number... ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number... ");
		int b=sc.nextInt();
		System.out.println("Enter the Third number... ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is the greatest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is the greatest number");
		}
		else
		{
			System.out.println(c+" is the greatest number");
		}
		sc.close();
	}

}
