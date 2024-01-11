package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_MultipleTabDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		String mainw=driver.getWindowHandle();
		System.out.println("Mainw is.. "+mainw);
		
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		Set<String> allw=driver.getWindowHandles();
		
		Iterator<String> i1=allw.iterator();
		while(i1.hasNext())
		{
			String childw=i1.next();
			System.out.println("ChildW is.. "+childw);
			if(!mainw.equals(childw))
			{
				driver.switchTo().window(childw);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("het@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(3000);
				driver.close();
				
			}
		}
		driver.switchTo().window(mainw);
		System.out.println("Mainw title is.. "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		
}
}