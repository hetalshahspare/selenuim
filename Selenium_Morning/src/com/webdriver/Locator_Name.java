package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.name("email")).sendKeys("abxdefghijklm");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}

}
