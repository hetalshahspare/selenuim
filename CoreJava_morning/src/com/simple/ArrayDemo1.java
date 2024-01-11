package com.simple;

import java.util.Scanner;

public class ArrayDemo1 
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];//to initialize array with size
		for(int i=0;i<50;i++)
		{
			a[i]=i;
			System.out.println(a[i]);
		}
		//Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value...");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
