package com.simple;

/*
1
23
456
78910
1112131415

*/
public class Pyramid5Demo 
{
	public static void main(String[] args) 
	{
		int k=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(k++);
			}
			System.out.println();
		}
		
	}

}
