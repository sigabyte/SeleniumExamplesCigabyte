package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classAssignment {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		
		WebElement dropdown = driver.findElement(By.id("_salicSelect"));
		Select locDropDown = new Select(dropdown);
		
		List<WebElement> listofoption = locDropDown.getOptions();
		
			
		for(WebElement option : listofoption) {
			System.out.println(option.getText());
			locDropDown.selectByVisibleText(option.getText());
			Thread.sleep(1500);
		}
		locDropDown.selectByVisibleText("Tajikistan");
		


	}

}
