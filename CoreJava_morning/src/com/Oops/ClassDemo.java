package com.Oops;

class Student
{
	int sno; //data member////variable
	String sname, city, degree;
	public void setData() //member function ////method
	{
		sno=10;
		sname="Hetal";
		city="Ankleahwar";
		degree="Bsc(IT)";
	}
	public void display()
	{
		
		System.out.println("Sno is.. "+sno);
		System.out.println("Sname is.. "+sname);
		System.out.println("City is.. "+city);
		System.out.println("Degree is.. "+degree);
	}
}

public class ClassDemo 
{
	public static void main(String[] args) 
	{
		Student s=new Student(); ///s is an object of student class
		s.setData();
		s.display();
	}
}
