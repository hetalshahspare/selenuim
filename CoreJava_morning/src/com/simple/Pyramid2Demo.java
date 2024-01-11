package com.simple;

/*
1
21
321
4321
54321

*/
public class Pyramid2Demo 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//row
		{
			for(int j=i;j>=1;j--)//column
			{
				System.out.print(j);
			}
			System.out.println();
		}	
	}

}
