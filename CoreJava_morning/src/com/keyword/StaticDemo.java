package com.keyword;

class SDemo
{
	int no;//local or nonstatic member
	static int sno;//static member
	public static void show()
	{
		sno=4321;
		System.out.println("Sno is.."+sno);
	}
}

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		SDemo.show();
		s1.no=10;
		s2.no=20;
		s3.no=30;
		System.out.println("s1.no is.."+s1.no);
		System.out.println("s2.no is.."+s2.no);
		System.out.println("s3.no is.."+s3.no);
	}
	

}
