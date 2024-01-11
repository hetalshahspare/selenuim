package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CSS_Attri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("hetalshah@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("het@123");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
