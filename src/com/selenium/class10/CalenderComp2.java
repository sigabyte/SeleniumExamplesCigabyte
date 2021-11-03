package com.selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderComp2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(iframe);

		WebElement dateTexBox = driver.findElement(By.id("datepicker"));
		dateTexBox.click();

		String date = "4 December 2022";
		String monthYear = date.substring(date.indexOf(" ") + 1);

		WebElement cpMonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		WebElement cpYear = driver.findElement(By.cssSelector(".ui-datepicker-year"));

		String cpMonthYear = cpMonth.getText() + " " + cpYear.getText();

		while (!monthYear.equals(cpMonthYear)) {
			WebElement nextIcon = driver.findElement(By.xpath("//a[@title='Next']"));
			nextIcon.click();

			Thread.sleep(2000);

			cpMonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
			cpYear = driver.findElement(By.cssSelector(".ui-datepicker-year"));

			cpMonthYear = cpMonth.getText() + " " + cpYear.getText();

		}
		
		String xPathCPDate = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='%s']";
		
		String day = date.replace(monthYear, "").trim();
		
		String xPathCPDateLoc = String.format(xPathCPDate, day);
		
		driver.findElement(By.xpath(xPathCPDateLoc)).click();

	}

}
