package com.simple;

public class DataTypeDemo 
{
	public static void main(String[] args)
	{
		int i1=2147483647;   // 4 bytes  | -2^32 to +2^32-1 | -2147483648 to 2147483647
		long l1=777777777;   // 8 bytes | -2^64 to 2^64-1
		char c1='A';         // 2 bytes
		byte b1=127;         // 1 bytes | -128 to 127
		float f1=456.65f;    // 4 bytes
		double d1=789987.65; // 8 bytes
		boolean bb=true;     // 1 bit
			System.out.println("Int is.. "+i1);
		System.out.println("long is.. "+l1);
		System.out.println("char is.. "+c1);
		System.out.println("byte is.. "+b1);
		System.out.println("float is.. "+f1);
		System.out.println("double is.. "+d1);
		System.out.println("boolean is.. "+bb);
		
		System.out.println("int bytes in... "+Integer.BYTES+" Bytes");
		System.out.println("float bytes in... "+Float.BYTES+" Bytes");
		System.out.println("double bytes in... "+Double.BYTES+" Bytes");
		System.out.println("long bytes in... "+Long.BYTES+" Bytes");
		
	}
}
