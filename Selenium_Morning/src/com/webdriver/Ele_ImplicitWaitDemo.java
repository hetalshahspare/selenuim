package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_ImplicitWaitDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
	}

}
