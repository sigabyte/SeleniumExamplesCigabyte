package com.selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSprintQA {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://learning.sprintqa.com/index");

		WebElement userName = driver.findElement(By.name("login"));
		userName.sendKeys("iciga");
		WebElement Pssword = driver.findElement(By.name("password"));
		Pssword.sendKeys("iciga123");
		WebElement button = driver.findElement(By.name("submit"));
		button.click();
	}
}
