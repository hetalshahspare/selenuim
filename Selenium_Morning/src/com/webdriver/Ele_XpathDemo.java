package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_XpathDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("Hetal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hetal123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
