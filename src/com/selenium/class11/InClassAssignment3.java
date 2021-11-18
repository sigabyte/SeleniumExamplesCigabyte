package com.selenium.class11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InClassAssignment3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");

		WebElement enableBtn = driver.findElement(By.xpath("//form[@id='input-example']/button"));
		enableBtn.click();

		WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/input"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(textBox));

		textBox.sendKeys("Ibrahim");

	}

}
