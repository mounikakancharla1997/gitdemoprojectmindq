package com.mymaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhishek {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='dateText']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='24']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='dateText']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()='29']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='dateText']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='dateText']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='2']")).click();
		Thread.sleep(3000);

	}

}
