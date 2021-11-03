package com.selenium.class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		WebElement thrdbutton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		thrdbutton.click();

		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alt2.getText());
		alt2.sendKeys("This ibrahim");
		Thread.sleep(2000);
		alt2.accept();
		
		

	}

}
