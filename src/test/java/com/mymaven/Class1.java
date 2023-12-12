package com.mymaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	
	
	@Test
	public void browserlaunch() throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		System.out.println("hi i am mounika this is my localrepository class");
		
		
		
		
	}

}
