package com.simple;

/*
dowhile :
---------
initialization
do
{
    statements;
    inc/dec operator;
} while(condition);

*/
public class DoWhileDemo 
{

	public static void main(String[] args) 
	{
		int i=1; //initialization
		do
		{
			System.out.println(i); //statement
			i++; //inc/dec op
		}while(i<=5); //condition
		//in the backend side how much line of code execute: 21 line of code execute
		
	}
}
