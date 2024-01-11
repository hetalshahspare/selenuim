package com.assignment1;

import java.util.Scanner;

public class ArmstrongOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=0;
		int copy= x;
		int size = Integer.toString(copy).length();
		while(copy!=0)
		{
			int rem = copy % 10;
			int mul = 1;
			for(int i=0;i<size;i++)
			{
				mul=mul*rem;
			}
			sum = sum + mul;
			copy=copy/10;
		}
		if(sum==x)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
		
		
	}

}
