package com.assignment1;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n, a=0,b=0,c=1;
		System.out.println("Enter value of n: ");
		n=sc.nextInt();
		System.out.println("Fibonacci Series: ");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
	}

}
//int n, a = 0, b = 0, c = 1;
//Scanner s = new Scanner(System.in);
//System.out.print("Enter value of n:");
//n = s.nextInt();
//System.out.print("Fibonacci Series:");
//for(int i = 1; i <= n; i++)
//{
//    a = b;
//    b = c;
//    c = a + b;
//    System.out.print(a+" ");
//}