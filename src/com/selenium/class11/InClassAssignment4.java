package com.selenium.class11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InClassAssignment4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");

		WebElement removeBtn = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
		WebElement checkbx = driver.findElement(By.xpath("//form[@id='checkbox-example']/div/input"));

		removeBtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(checkbx));

		System.out.println(isAvailable(checkbx));

	}

	public static boolean isAvailable(WebElement element) {
		try {
			element.getText();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
