package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");//RC
		WebDriver driver=new ChromeDriver();//open blank browser
		driver.get("https://www.google.com/");//to open the url
		Thread.sleep(3000);
		System.out.println("Title is.. "+driver.getTitle());
		System.out.println("URL is.. "+driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://www.google.com/"))
		{
			System.out.println("Your test is passed");
		}
		else
		{
			System.out.println("Your test is failed");
		}
			driver.close();
	}

}
