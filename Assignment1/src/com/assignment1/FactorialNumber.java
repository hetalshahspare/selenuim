
//W.A.J.P to find factorial for Given Number. 

package com.assignment1;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int fact=1;
		for (int i=x;i>=1;i--) 
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+x+" is "+fact);
		sc.close();
	}
}


