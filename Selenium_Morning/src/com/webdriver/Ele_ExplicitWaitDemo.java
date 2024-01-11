package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ele_ExplicitWaitDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		Thread.sleep(2000);
		WebDriverWait w1=new WebDriverWait(driver, 30);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='webdriver']")));
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
