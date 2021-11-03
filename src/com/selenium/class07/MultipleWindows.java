package com.selenium.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/windows");

		String currentwindowId = driver.getWindowHandle();

		WebElement clickHereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHereLink.click();

		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String WindowId : listOfWindowsId) {
			if (!WindowId.equals(currentwindowId)) {
				driver.switchTo().window(WindowId);
			}

		}

		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(currentwindowId);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
