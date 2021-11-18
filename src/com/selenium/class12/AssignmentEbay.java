package com.selenium.class12;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEbay {
	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.co.uk/");

		// Entering TV into search box
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("tv");

		// Click on Search Button
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		searchBtn.click();

		// list of items elements

		List<WebElement> listofItems = driver
				.findElements(By.xpath("//div[@id='srp-river-main']//img[@class='s-item__image-img']"));

		// for loop to click on each item
		for (int i = 0; i < listofItems.size(); i++) {
			listofItems.get(i).click();
			String currentWindow = switchToWindow(driver);

			// code to retrieve phone & email

			try {
				WebElement completeInfoLink = driver
						.findElement(By.xpath("//div[@id='bsi-ec']//a[text()='Complete information']"));
				completeInfoLink.click();

				WebElement phnnum = driver.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span"));
				System.out.println("Phone Number= " + phnnum.getText());

				WebElement email = driver.findElement(By.xpath("//span[text()='Email:']/following-sibling::span"));
				System.out.println("Email Address= " + email.getText());

			} catch (Exception e) {
				System.out.println(i + "Phone number or Email address not available");

			}

			driver.close();
			driver.switchTo().window(currentWindow);

		}

	}

	public static String switchToWindow(WebDriver driver) {
		String currentWindowId = driver.getWindowHandle();
		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String windowId : listOfWindowsId) {
			if (!windowId.equals(currentWindowId)) {
				driver.switchTo().window(windowId);
			}
		}
		return currentWindowId;

	}

}
