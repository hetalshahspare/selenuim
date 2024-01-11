package com.assignment1;


class Parent //is a parent class
	{
		String message;
		public void setParentData()
		{
			message="This is a parent class";
		}
	}
	class C1 extends Parent //sport is a child class of student1 parentclass
	{
		String message1;
		public void setC1Data()
		{
			message1="This is first subclass";
		}
		//public void display()
		{
			System.out.println("Message is.. "+message);
			System.out.println("Message is.. "+message1);
		}
	}
	class C2 extends Parent
	{
		String message2;
		public void setC2Data()
		{
			message2="This is second subclass";
		}
		public void display()
		{
			System.out.println("Message is.. "+message);
			System.out.println("Message is.. "+message1);
			System.out.println("Message is.. "+message2);
		}
		public void setC1Data() {
			// TODO Auto-generated method stub
			
		}
	}
	public class Inheritance 
	{
		public static void main(String[] args) 
		{
			//Sport s1=new Sport();
			//s1.setStudentData();
			//s1.setSportData();
			//s1.display();
			C2 r1=new C2();
			r1.setParentData();
			r1.setC1Data();
			r1.setC2Data();
			r1.display();
		}
	}
}