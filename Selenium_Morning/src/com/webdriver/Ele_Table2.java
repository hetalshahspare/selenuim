package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TOPS\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		//String msg=driver.findElement(By.xpath("//*[@id="leftcontainer"]/table/thead/tr/th[1]")).getText();
		//System.out.println(msg);
		
		//String msg1=driver.findElement(By.xpath("//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a")).getText();
		//System.out.println(msg1);
		
		List<WebElement> th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Th size is.. "+th.size());
		
		List<WebElement> tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Tr size is.. "+tr.size());
		
		for(int i=1;i<=th.size();i++)
			{
			String msg=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
			System.out.print(msg+"      ");
			}
		System.out.println();
		for(int i=1;i<=tr.size();i++)
		{
			for(int j=1;j<=th.size();j++)
			{
				String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(value+"      ");
			}
			System.out.println();
		}
			
		}

}
