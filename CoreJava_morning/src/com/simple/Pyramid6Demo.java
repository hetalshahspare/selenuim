package com.simple;

/*

1
01
101
0101
10101

*/
//public class Pyramid6Demo 
//{
//	public static void main(String[] args) 
//	{
//		for(int i=1;i<=5;i++)
//			{
//				for(int j=i;j>=1;j--)
//				{
//					System.out.print(j%2);
//				}
//				System.out.println();
//			}		
//	}
//
//}

/*

1
10
101
1010
10101

1
01
101
0101
10101


 */

public class Pyramid6Demo 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
			{
				for(int j=i;j<=5;j++)
				{
					System.out.print(j%2);
				}
				System.out.println();
			}		
	}

}