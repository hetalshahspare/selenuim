//W.A.J.P to check given number is Prime or not?

package com.assignment1;

import java.util.Scanner;

public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean prime = true;
		for (int i = a - 1; i > 1; i--) 
		{
			if (a % i == 0) 
			{
				prime = false;
				break;
			}
		}
		if (prime == true) 
		{
			System.out.println("This number is Prime number");
		} else 
		{
			System.out.println("This number is not a Prime number");
		}
		sc.close();
	}
}