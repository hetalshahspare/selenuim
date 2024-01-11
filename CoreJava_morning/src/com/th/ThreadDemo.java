package com.th;

class First extends Thread
{
	public void run()//running
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My first thread is.. "+i);
		}
		System.out.println("My first thread is completed... ");
	}
}

public class ThreadDemo 
{
	public static void main(String[] args)
	{
		First f1=new First();//newborn
		f1.start();//runnable
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My main thread is... "+i);
		}
		System.out.println("My main thread is completed... ");
		
	}

}
