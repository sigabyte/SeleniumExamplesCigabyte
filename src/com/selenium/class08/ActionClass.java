package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/");
		
		WebElement clickElectro =driver.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/li/a[text()='Electronics']"));
				
		WebElement clickcell = driver.findElement(By.xpath("//div[@class='hl-cat-nav__sub-cats']//a[text()='Apple']"));
				
		Actions action = new Actions(driver);
		action.moveToElement(clickElectro).pause(1000).click(clickcell).build().perform();

	}

}
