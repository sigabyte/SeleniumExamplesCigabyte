package com.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAndTypeExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/sch/ebayadvsearch?_from=R40&_trksid=p2380057.m570.l1313&_nkw=TV&_sacat=0");
		
		//driver.findElement(By.id("gh-ac")).sendKeys("TV");
		
		//driver.findElement(By.id("welcome-menu//a[text()='Logout'")).click();
		
		driver.findElement(By.id("LH_Located")).click();
		

	}

}
