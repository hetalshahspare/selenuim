package com.simple;

public class NestedIfDemo 
{
	public static void main(String[] args) 
	{
		int no=-8;
		if(no>=0)
		{
			if(no==0)
			{
				System.out.println("Your no is zero..."+no);			
			}
			else
			{
				System.out.println("Your no is positive..."+no);
			}
		}
		else
		{
			System.out.println("Your no is negative..."+no);
		}
	}
}
