package com.keyword;

class Staff
{
	String stname;
	public void setStaffData()
	{
		stname="Chiku";
	}
}
class Inter extends Staff implements Student, Sport
{
	String sname;
	public void setData()
	{
		sname="Hetal";
	}
	@Override
	public void display()
	{
		System.out.println("Sno is.. "+sno);
		System.out.println("Sname is.. "+sname);
		System.out.println("Staffname is.. "+stname);
		System.out.println("Spname is.. "+spname);
	}
}

public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Inter i1=new Inter();
		i1.setData();
		i1.setStaffData();
		i1.display();	
	}
}
