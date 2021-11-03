package com.selenium.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/");

		String currentwindowId = driver.getWindowHandle();

		WebElement srch = driver.findElement(By.id("gh-ac"));
		srch.sendKeys("TV");

		WebElement srcButton = driver.findElement(By.id("gh-btn"));
		srcButton.click();

		WebElement frstlink = driver.findElement(By.xpath("//h3[text()='Bea LED TV 32”hd Ready ba-3221']"));
		frstlink.click();

		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String WindowId : listOfWindowsId) {
			if (!WindowId.equals(currentwindowId)) {
				driver.switchTo().window(WindowId);
			}

		}

		WebElement sellername = driver.findElement(By.xpath("//span[text()='mgworldmg']"));
		System.out.println(sellername.getText());

		driver.close();

		driver.switchTo().window(currentwindowId);

		Thread.sleep(3000);

		driver.close();

	}

}
