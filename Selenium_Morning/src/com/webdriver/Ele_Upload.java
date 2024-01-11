package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Upload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Dell\\Downloads\\Het");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
	
