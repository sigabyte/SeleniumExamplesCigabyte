package com.selenium.class12;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangeDowloadLocation {
	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// to change default download location
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Users\\PROTOCOL\\Pictures");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://the-internet.herokuapp.com/download");

		// to download a file
		WebElement download = driver.findElement(By.xpath("//div[@id='content']//a[text()='webdriverIO.png']"));
		download.click();

	}

}
