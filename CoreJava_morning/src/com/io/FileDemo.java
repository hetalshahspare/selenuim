package com.io;

import java.io.File;
import java.io.IOException;

class FDemo
{
	File file;
	public FDemo()
	{
		file=new File("a3.txt");
		try 
		{
			file.createNewFile();
			show();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void show()
	{
		System.out.println("Is Directory or not.. "+file.isDirectory());
		System.out.println("is File or not.. "+file.isFile());
		System.out.println("can read or not.. "+file.canRead());
		System.out.println("can write or not.. "+file.canWrite());
		System.out.println("can Execute or not.. "+file.canExecute());
		System.out.println("Filename is.. "+file.getName());
		System.out.println("Filepath is.. "+file.getPath());
		System.out.println("Fileabsopath is.. "+file.getAbsolutePath());
	}
}
public class FileDemo 
{
	public static void main(String[] args) 
	{
		new FDemo();
		
	}

}
