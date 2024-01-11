package com.simple;

/*
1
12
123
1234
12345

*/
public class Pyramid1Demo 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
