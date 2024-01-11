package com.Oops;

import java.util.Scanner;

public class ScannerDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter no: ");
		int no=sc.nextInt();
		//sc.nextLine();
		System.out.println("Enter full name");
		String name=sc1.nextLine();
		
		System.out.println("Your no is.. "+no);
		System.out.println("Your name is.. "+name);
	}
	
}
