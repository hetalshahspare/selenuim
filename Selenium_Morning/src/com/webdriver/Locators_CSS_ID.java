package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CSS_ID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("hetalshah@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("het@123");
		Thread.sleep(2000);
		
		driver.close();
	}

}
