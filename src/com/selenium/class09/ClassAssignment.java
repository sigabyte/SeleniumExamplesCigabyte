package com.selenium.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://datatables.net/");

		List<WebElement> data = driver
				.findElements(By.xpath("//table[@id='example']/tbody/tr/td[not(@style='display:none')]"));
		
		for (WebElement tdata : data) {
			System.out.println(tdata.getText());
			}
		
		
	}
}
