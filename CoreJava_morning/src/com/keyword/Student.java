package com.keyword;

interface Sport
{
	String spname="Cricket";
}

public interface Student extends Sport
{
	int sno=100;
	public void display();
}
