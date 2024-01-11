package com.simple;

/*
5
45
345
2345
12345
*/public class Pyramid4Demo 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)//row
		{
			for(int j=i;j<=5;j++)//column
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
