package com.mymaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	
	@Test
	public void browserLaunch() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
	System.out.println("hi i am mounika this is my localrepository class");

}}
