package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/");
		
		WebElement sigin = driver.findElement(By.xpath("//span[@id='gh-ug']//a[text()='Sign in']"));
		
		Actions newtab = new Actions(driver);
		newtab.keyDown(Keys.CONTROL).pause(1000).click(sigin).keyUp(Keys.CONTROL).build().perform();

	}

}
