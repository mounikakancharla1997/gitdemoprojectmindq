package com.mymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManger.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		
		//uid 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		//pwd
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		//login
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.close();

}




	}

