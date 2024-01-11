package com.Oops;

import java.util.Scanner;

public class ScannerDemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//to get the value from the user
		System.out.println("Enter No 1: ");
		int a=sc.nextInt();
		System.out.println("Enter No 2: ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum is.. "+c);
		
	}

}
