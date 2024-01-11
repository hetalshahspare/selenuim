package com.Oops;

class Customer
{
	int cid;
	String pname;
	float price;
	public void setData()
	{
		cid=1;
		pname="Colgate";
		price=143.37f;
	}
	public void display()
	{
		System.out.println("Cid is..."+cid);
		System.out.println("Pname is..."+pname);
		System.out.println("Price is..."+price);
	}
}
public class ClassDemo1 
{
	public static void main(String[] args) 
	{
		Customer c=new Customer();
		c.setData();
		c.display();
	}
}
