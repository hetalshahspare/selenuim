package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Linktext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");//RC
		WebDriver driver=new ChromeDriver();//open blank browser
		driver.get("https://www.facebook.com/");//to open the url
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.close();
	}
}
