package com.selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		//Switch to iframe
		driver.switchTo().frame("mce_0_ifr");

		WebElement textbox = driver.findElement(By.id("tinymce"));
		textbox.clear();
		textbox.sendKeys("hello ibrahim");
		
		// exit from iframe
		driver.switchTo().defaultContent();
		
		WebElement header = driver.findElement(By.xpath("//h3"));
		System.out.println(header.getText());
		
		
		

	}

}
