package com.simple;

/*
5
54
543
5432
54321


*/public class Pyramid3Demo 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=i;j--)//column
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
