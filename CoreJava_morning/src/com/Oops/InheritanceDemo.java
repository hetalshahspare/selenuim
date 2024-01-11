package com.Oops;

class Student1 //is a parent class
{
	int sid;
	String sname,city;
	public void setStudentData()
	{
		sid=1;
		sname="Het";
		city="Ank";
	}
}
class Sport extends Student1 //sport is a child class of student1 parentclass
{
	String spname;
	public void setSportData()
	{
		spname="Cricket";
	}
	//public void display()
	{
		System.out.println("sid is.. "+sid);
		System.out.println("Sname is.. "+sname);
		System.out.println("city is.. "+city);
		System.out.println("Sportname is.. "+spname);
	}
}
class Result extends Sport
{
	String grade;
	public void setResultData()
	{
		grade="A+";
	}
	public void display()
	{
		System.out.println("sid is.. "+sid);
		System.out.println("Sname is.. "+sname);
		System.out.println("city is.. "+city);
		System.out.println("Sportname is.. "+spname);
		System.out.println("Grade is.. "+grade);
	}
}
public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		//Sport s1=new Sport();
		//s1.setStudentData();
		//s1.setSportData();
		//s1.display();
		Result r1=new Result();
		r1.setStudentData();
		r1.setSportData();
		r1.setResultData();
		r1.display();
	}
}
