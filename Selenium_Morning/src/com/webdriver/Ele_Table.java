package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\TOPS\\Project_WS\\Selenium_Morning\\src\\com\\html\\Index1.html");
		Thread.sleep(2000);
		
		//String td=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[4]")).getText();
		//System.out.println("TD is.. "+td);
		
		for(int  i=1;i<=4;i++)//row
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1)
				{
					String msg=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText();
					System.out.println(msg+"       ");
				}
				else
				{
					String msg=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(msg+"       ");
					Thread.sleep(1000);
				}
			}
			System.out.println();
		}

	}

}
