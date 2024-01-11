package com.Oops;

class Parent
{
	String pname;
	public void setParentData()
	{
		pname="Pareshbhai";
	}
}
class Child1 extends Parent
{
	String cname;
	public void setChildData()
	{
		cname="Hetal";
	}
	public void display()
	{
		System.out.println(cname+pname);
	}
}
class Child2 extends Parent
{
	String cname;
	public void  setChildData()
	{
		cname="Het";
	}
	public void display()
	{
		System.out.println(cname+pname);
	}
}
public class HeirarchicalDemo 
{
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		c1.setParentData();
		c1.setChildData();
		c1.display();
		
		Child2 c2=new Child2();
		c1.setParentData();
		c1.setChildData();
		c1.display();	
	}
}
