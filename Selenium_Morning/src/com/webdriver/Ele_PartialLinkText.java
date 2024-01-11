package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:\\TOPS\\Project_WS\\Selenium_Morning\\src\\com\\html\\Index.html");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		
		driver.close();
	}

}
