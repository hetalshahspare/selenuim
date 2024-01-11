package com.keyword;

final class FDemo
{
	final int no=100;
	String name;
	public final void  setData()
	{
		//no=123;
		name="Hetal";
	}
	public void show()
	{
		System.out.println("Your No is.."+no);
		System.out.println("Your Name is.."+name);
	}
}

public class FinalDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
		f1.setData();
		f1.show();

}
}