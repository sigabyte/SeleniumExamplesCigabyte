package com.selenium.class08;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// Login orange HRM
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		WebElement Pssword = driver.findElement(By.id("txtPassword"));
		Pssword.sendKeys("admin123");
		WebElement button = driver.findElement(By.id("btnLogin"));
		button.click();
		
		//Hovering mouse on Admin
		WebElement adminaction = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermanage = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement user = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		Actions action = new Actions(driver);
		action.moveToElement(adminaction).pause(1000).moveToElement(usermanage).pause(1000).moveToElement(user).click().build().perform();
		
		
	}

}
