package com.mymaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit {
	public static void main(String[] args) throws IOException, Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("F:\\res.exe");
		Thread.sleep(3000);
		driver.close();
	}

}
