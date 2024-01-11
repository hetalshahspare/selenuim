package com.simple;

public class TypeConversionDemo
{
	public static void main(String[] args)
	{
		int i=10; //4 byte
		long l; //8 byte
		
		l=i; //implicit
		System.out.println("implicit is.. " +l);
		
		int k; //4 byte
		long l1=123456789410L;
		k=(int)l1;
		System.out.println("Explicit is.." +k);
	
		int a=130; //4 byte
		byte b; //1 byte
		
		b=(byte)a;
		System.out.println("Ex Byte is.." +b);
	}

}
