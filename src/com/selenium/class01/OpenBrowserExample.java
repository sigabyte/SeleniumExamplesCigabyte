package com.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserExample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// driver is the browser
		WebDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
		//
		driver.get("https://www.ebay.com/");
		//
		driver.findElement(By.id("gh-ac")).sendKeys("TV");
		//
		driver.findElement(By.id("gh-btn")).click();
		
		driver.close();
		
		
		
	}

}
