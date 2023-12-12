 package com.mymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adactin_Login {
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		 driver=new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/index.php");
		 driver.manage().window().maximize();
	}
	@Test (priority=1)
	public void launch1() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("mvenkatesh");
		driver.findElement(By.name("password")).sendKeys("HE63X0");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}
	 
  }




