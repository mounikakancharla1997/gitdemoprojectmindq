package com.mymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFunctionality {


	public static void main(String[] args) throws InterruptedException {
		//To Initialize the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
		//To click on sign in
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("LakshmiSurya");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8555813031");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);

	}

}
